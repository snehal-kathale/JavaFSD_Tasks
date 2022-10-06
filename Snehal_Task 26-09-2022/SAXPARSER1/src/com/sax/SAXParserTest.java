package com.sax;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

public class SAXParserTest {

    public static void main(String[] args) throws SAXException {

        try {
            // File Path
            String filePath = "Student.xml";

            // Create file object.
            File inputFile = new File(filePath);

            //Get SAXParserFactory instance.
            SAXParserFactory factory = SAXParserFactory.newInstance();


            //Get SAXParser object from SAXParserFactory instance.
            SAXParser saxParser = factory.newSAXParser();

            //Create StudentHandler object.
            StudentHandler handler = new StudentHandler();


            //Parse the XML file.
            saxParser.parse(inputFile, handler);



        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




    }

}
