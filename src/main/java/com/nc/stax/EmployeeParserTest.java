package com.nc.stax;

import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

public class EmployeeParserTest {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

		String xmlPath = "C:\\Users\\nirk0816\\git\\experiments\\src\\main\\java\\com\\nc\\stax\\employees.xml";
		EmployeesParser parser = new EmployeesParser();
		//parser.parse(xmlPath);
		
		String xmlOutputPath = "C:\\Users\\nirk0816\\git\\experiments\\src\\main\\java\\com\\nc\\stax\\employeesNew.xml";
		parser.createXml(xmlOutputPath);
	}

}
