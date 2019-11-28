package com.company;

import org.xml.sax.SAXException;


import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        //////////DOM DEMO////////////////////////
        //DOMElem dom = new DOMElem("resources\\testXML\\Test1.xml");
        //dom.randomizeNames();
        //dom.save("resources\\testXML\\2.xml");

        ////////XSD Validation//////////////////////////////////////////////////
        //XMLByXSDValidator validator = new XMLByXSDValidator();
        //System.out.println(validator.checkByXSD("resources\\testXML\\TestXSD.xsd", "resources\\testXML\\2.xml"));

        //////////SAX DEMO//////////////////////////////////////////
        //MySAXHandler mySaxHandler = new MySAXHandler();
        //MySAXParser mySAXParser = new MySAXParser();
        //mySAXParser.parse("resources\\testXML\\2.xml", mySaxHandler);

        ///////////JAXB DEMO///////////////////////
        JAXBParser jaxbParser = new JAXBParser("resources\\testXML\\3.xml");


    }
}
