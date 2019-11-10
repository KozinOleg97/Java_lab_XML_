package com.company;

import org.xml.sax.SAXException;


import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {


        /////DOMElem dom = new DOMElem("resources\\testXML\\Test1.xml");

        /////dom.randomizeNames();
        /////dom.save("resources\\testXML\\2.xml");

        //XMLByXSDValidator validator = new XMLByXSDValidator();
        //System.out.println(validator.checkByXSD("resources\\testXML\\TestXSD.xsd", "2.xml"));


       ////////MySAXHandler mySaxHandler = new MySAXHandler();
       ////////MySAXParser mySAXParser = new MySAXParser();

       ////////mySAXParser.parse("resources\\testXML\\2.xml", mySaxHandler);


        JAXBParser jaxbParser = new JAXBParser("resources\\testXML\\3.xml");



    }
}
