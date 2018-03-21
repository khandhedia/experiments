package com.nc.stax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class EmployeeParserTest {

	public static void main(String[] args) throws XMLStreamException, XPathExpressionException, ParserConfigurationException, SAXException, IOException {

		String xmlPath = "C:\\Users\\NirMit\\IdeaProjects\\experiments\\src\\main\\java\\com\\nc\\stax\\employees.xml";
		EmployeesParser parser = new EmployeesParser();
		parser.parse(xmlPath);
		
		String xmlOutputPath = "C:\\Users\\NirMit\\IdeaProjects\\experiments\\src\\main\\java\\com\\nc\\stax\\employeesNew.xml";
		parser.createXml(xmlOutputPath);
		
		parser.query(xmlPath);
	}

}
