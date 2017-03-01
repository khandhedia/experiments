package com.nc.parser1;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserNew {
	
	public static void main(String[] args) {
		
		
		String xmlPath = "d://Workspaces//NTT-Docomo//RnD-NC//src//com//nc//parser//employees.xml";
		try {
			parseXml(xmlPath);
		} catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException e) {
			e.printStackTrace();
		}
		
	}

	private static void parseXml(String xmlPath) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		
		Document document = documentBuilder.parse(xmlPath);
		
		//Getting the root element
		Element element = document.getDocumentElement();
		System.out.println("Element Name : " + element.getNodeName());
		
		//Next Sibling - It will return null because there cannot be sibling of root element.
		System.out.println("Next Sibling : " + element.getNextSibling());
		
		//Node Type
		System.out.println("Element Node Type: " + element.getNodeType());
		
/*		
  				Node Types:
  
  			    public static final short ELEMENT_NODE              = 1;
			    public static final short ATTRIBUTE_NODE            = 2;
			    public static final short TEXT_NODE                 = 3;
			    public static final short CDATA_SECTION_NODE        = 4;
			    public static final short ENTITY_REFERENCE_NODE     = 5;
			    public static final short ENTITY_NODE               = 6;
			    public static final short PROCESSING_INSTRUCTION_NODE = 7;
			    public static final short COMMENT_NODE              = 8;
			    public static final short DOCUMENT_NODE             = 9;
			    public static final short DOCUMENT_TYPE_NODE        = 10;
			    public static final short DOCUMENT_FRAGMENT_NODE    = 11;
			    public static final short NOTATION_NODE             = 12;
*/		
		
		System.out.println(element.getFirstChild().getNodeName());
		
		//Node Value
		System.out.println(element.getNodeValue());
		
		NodeList nodeList = document.getChildNodes();
		System.out.println("NodeList Length = " + nodeList.getLength());
		
		for(int i = 0 ; i < nodeList.getLength() ; i++)
		{
			Node node  = nodeList.item(i);
			System.out.println("Main Node : " + node.getNodeName());
			
			NodeList internalNodeList = node.getChildNodes();
			for(int j = 0 ; j < internalNodeList.getLength() ; j++)
			{
				Node childNode = internalNodeList.item(j);
				System.out.println("Internal Node : "+childNode.getNodeName());
			}
		}
		
		
		
		//Get nodes having a particular tag name
		nodeList = document.getElementsByTagName("firstName");
		
		if(null != nodeList)
		{
			for(int i=0 ; i< nodeList.getLength(); i++)
			{
				Node node = nodeList.item(i);
				System.out.println(node.getNodeType());
			}
		}
		
		
		
		/*XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xPath = xPathFactory.newXPath();
		Node node = (Node) xPath.evaluate("//employees//employee//firstname", document, XPathConstants.NODE);
		System.out.println(node == null ? "" : node.getNodeName());*/
		
		
	}

}
