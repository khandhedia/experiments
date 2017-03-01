package com.nc.stax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class EmployeesParser {

	List<Employee> employees = null;
	Employee employee = null;

	XMLEvent end;
	XMLEvent tab;

	XMLEventWriter xmlEventWriter = null;

	/*
	 * To parse the XML we need to use XMLInputFactory XMLEventReader
	 * 
	 * XMLEvent is what is to be read
	 */

	public void parse(String xmlPath) throws FileNotFoundException, XMLStreamException {

		XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();

		File file = new File(xmlPath);
		InputStream is = new FileInputStream(file);
		XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(is);

		while (xmlEventReader.hasNext()) {
			XMLEvent xmlEvent = xmlEventReader.nextEvent();

			// Checking if event is a start element
			if (xmlEvent.isStartElement()) {
				// Treating xmlEvent as Start Element object
				StartElement startElement = xmlEvent.asStartElement();

				// getName() on StartElement object will return QName object.
				// System.out.println("QName : " + startElement.getName());

				// getLocalPart() on QName object will return String name.
				// System.out.println("Name : " +
				// startElement.getName().getLocalPart());

				if (EmployeeXmlTags.EMPLOYEES.equals(startElement.getName().getLocalPart())) {
					employees = new ArrayList<>();
				}

				if (EmployeeXmlTags.EMPLOYEE.equals(startElement.getName().getLocalPart())) {
					employee = new Employee();

					Iterator<Attribute> itr = startElement.getAttributes();
					while (itr.hasNext()) {
						Attribute attr = itr.next();
						if (EmployeeXmlTags.EMPLOYEE_ID.equals(attr.getName().getLocalPart())) {
							employee.setId(attr.getValue());
						}
					}

				}

				if (EmployeeXmlTags.FIRST_NAME.equals(startElement.getName().getLocalPart())) {
					XMLEvent xmlEvent2 = xmlEventReader.nextEvent();
					employee.setFirstName(xmlEvent2.asCharacters().getData());
				}

				if (EmployeeXmlTags.LAST_NAME.equals(startElement.getName().getLocalPart())) {
					XMLEvent xmlEvent2 = xmlEventReader.nextEvent();
					employee.setLastName(xmlEvent2.asCharacters().getData());
				}

				if (EmployeeXmlTags.LOCATION.equals(startElement.getName().getLocalPart())) {
					XMLEvent xmlEvent2 = xmlEventReader.nextEvent();
					employee.setLocation(xmlEvent2.asCharacters().getData());
				}
			}

			else if (xmlEvent.isEndElement()) {
				EndElement endElement = xmlEvent.asEndElement();
				if (EmployeeXmlTags.EMPLOYEE.equals(endElement.getName().getLocalPart())) {
					employees.add(employee);
				}
			}
		}

		System.out.println(Arrays.toString(employees.toArray()));

	}

	/*
	 * To create the xml we need to use XMLOutputFactory XMLEventWriter
	 * 
	 * XMLEvent is what is to be written. Hence, we need to generate XMLEvent
	 * using XMLEventFactory.
	 * 
	 */

	public void createXml(String xmlPath) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();

		File file = new File(xmlPath);
		OutputStream outputStream = new FileOutputStream(file);
		xmlEventWriter = xmlOutputFactory.createXMLEventWriter(outputStream);

		XMLEventFactory xmlEventFactory = XMLEventFactory.newFactory();

		end = xmlEventFactory.createDTD("\n");
		tab = xmlEventFactory.createDTD("\t");

		StartDocument startDocument = xmlEventFactory.createStartDocument();
		xmlEventWriter.add(startDocument);
		lineBreak(1);

		// creating start element tag for EMPLOYEES
		StartElement employeesStartTag = xmlEventFactory.createStartElement("", "", EmployeeXmlTags.EMPLOYEES);
		xmlEventWriter.add(employeesStartTag);
		lineBreak(1);

		// Creating Attribute for Employee Tag
		Attribute empId = xmlEventFactory.createAttribute(EmployeeXmlTags.EMPLOYEE_ID, "10");

		// Creating list to carry attributes
		List<Attribute> list = new ArrayList<>();
		list.add(empId);

		// creating start element tag for EMPLOYEE with attributes
		StartElement employeeStartTag = xmlEventFactory.createStartElement("", "", EmployeeXmlTags.EMPLOYEE,
				list.iterator(), null);
		tab(1);
		xmlEventWriter.add(employeeStartTag);
		lineBreak(1);

		// creating child elements in employees tag
		createNode(xmlEventFactory, xmlEventWriter, EmployeeXmlTags.FIRST_NAME, "Nirav", null);
		createNode(xmlEventFactory, xmlEventWriter, EmployeeXmlTags.LAST_NAME, "Khandhedia", null);
		createNode(xmlEventFactory, xmlEventWriter, EmployeeXmlTags.LOCATION, "Rajkot", null);

		// creating end element tag for EMPLOYEE
		EndElement employeeEndElement = xmlEventFactory.createEndElement("", "", EmployeeXmlTags.EMPLOYEE);
		tab(1);
		xmlEventWriter.add(employeeEndElement);
		lineBreak(1);

		// creating end element tag for EMPLOYEES
		EndElement employeesEndElement = xmlEventFactory.createEndElement("", "", EmployeeXmlTags.EMPLOYEES);
		xmlEventWriter.add(employeesEndElement);
		lineBreak(1);

		xmlEventWriter.close();

	}

	private void createNode(XMLEventFactory xmlEventFactory, XMLEventWriter xmlEventWriter, String name, String value,
			Iterator<Attribute> attributes) throws XMLStreamException {

		end = xmlEventFactory.createDTD("\n");
		tab = xmlEventFactory.createDTD("\t");

		tab(2);

		StartElement startElement = xmlEventFactory.createStartElement("", "", name, attributes, null);
		xmlEventWriter.add(startElement);

		Characters characters = xmlEventFactory.createCharacters(value);
		xmlEventWriter.add(characters);

		EndElement endElement = xmlEventFactory.createEndElement("", "", name);
		xmlEventWriter.add(endElement);
		lineBreak(1);
	}
	
	//XPath query/expression evaluation is possible using DOM.
	//One needs to create DOMBuilderFactory to get DocumentBuilder object which would parse the XML and get a DOM object.
	//DOM parser takes input as InputStream objects - which can be achieved by FileInputStream implementation.
	//
	//String query needs to be passed to XPath compilation which would result in XPathExpression.
	//XPathExpression can be evaluated and multiple types of results can be expected according to the parameter given in evaluate() method.
	//To Generate the XPath one needs to use XPathFactory.
	
	public void query(String xmlPath) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException
	{
		//DOMParsing of XML - Start
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		
		File file = new File(xmlPath);
		InputStream is = new FileInputStream(file);
		Document document = documentBuilder.parse(is);
		//DOMParsing of XML - End
		
		//XPath Creation - Start
		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xPath = xPathFactory.newXPath();
		//XPath Creation - End

		
		//String Query
		String query = "//employees/employee[firstName='Rajesh']/lastName/text()";
		
		//Generating XPathExpression out of String query 
		XPathExpression expression = xPath.compile(query);
		
		//Evaluating XPathExpression to get NodeList/NodeSet
		NodeList nodeList = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
		
		for(int i= 0 ; i < nodeList.getLength() ; i++)
		{
			 System.out.println(nodeList.item(i).getNodeValue());
		}
		
		//Modified query to get count of instances
		query = "count(//employees/employee[firstName='Rajesh']/lastName/text())";

		//Generating XPathExpression out of Modified String query 
		expression = xPath.compile(query);
		
		//Evaluating XPathExpression to get NodeList/NodeSet
		Double count = (Double) expression.evaluate(document, XPathConstants.NUMBER);
		System.out.println("Count = " + count);
		
		
		//Re-Modified query to check if count of instances is more than 2
		query = "count(//employees/employee[firstName='Rajesh']/lastName/text()) > 2";

		//Generating XPathExpression out of Modified String query 
		expression = xPath.compile(query);
				
		//Evaluating XPathExpression to get NodeList/NodeSet
		Boolean result = (Boolean) expression.evaluate(document, XPathConstants.BOOLEAN);
		System.out.println("Number of instance is more than 2 = " + result);		
		
		
		
		
	}
	

	private void lineBreak(int count) throws XMLStreamException {
		for (int i = 0; i < count; i++) {
			xmlEventWriter.add(end);
		}
	}

	private void tab(int count) throws XMLStreamException {
		for (int i = 0; i < count; i++) {
			xmlEventWriter.add(tab);
		}
	}

}
