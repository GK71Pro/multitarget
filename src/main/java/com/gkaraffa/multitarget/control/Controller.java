package com.gkaraffa.multitarget.control;

import com.gkaraffa.simpleconfig.SimpleXMLReader;
import com.gkaraffa.simpleconfig.SimpleXMLReaderFactory;

public class Controller {

	public static void main(String[] args) {
		try {
			SimpleXMLReader configReader = SimpleXMLReaderFactory.createSimpleXMLReader("config.xml");
			String testText = configReader.getParameter("testText");
			System.out.println(testText);
		}
		catch (Exception e) {
			
		}
	}

}
