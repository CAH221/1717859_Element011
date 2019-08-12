//**********************************************//
//* Author:1717859                             *//
//* Week:                                      *//
//* Element:    Assignment 2                   *//
//* Description: Displays all jet plane info   *//
//* in the xml file                            *//
//* Date: 8th August 2019                      *//
//*                                            *//
//**********************************************//

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

//Polymorphism parent class and sub class XML_Reader
public class Xml_JetPlanesReader extends XML_Reader
{
	
	//read from xml file
	private static String theFilename = "D:/Jetplanes.xml";
	private static Document aDocument;
	// constructor
	public Xml_JetPlanesReader()
	{
		System.out.println("Show me the planes Information...!");
		
		//connect to server
		aDocument = serverFileConnection(theFilename);
		setDocument(aDocument);
	}
	//getter method
	public static Document getDocument()
	{
		return aDocument; 
	}
	//setter method
	public static void setDocument(Document myDoc)
	{
		aDocument = myDoc;
	}
		
	
	// implementing the inherited abstract method
	// so there is a method body this time
	public void textDisplay(Document theDoc)
	{		
		//Displaying all the jet plane information
	    theDoc = getDocument();
		System.out.println("Root element :" + theDoc.getDocumentElement().getNodeName());
			
		NodeList nList = theDoc.getElementsByTagName("Jet");
				
		System.out.println("----------------------------");
        
		//Loop through the whole jet plane xml file
		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
			//Display the elements in the xml file 		
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
			
			//Exception handling
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eElement = (Element) nNode;
                
				//print all jet plane information
				System.out.println("Jet ID : " + eElement.getAttribute("id"));
				System.out.println("Jet Name : " + eElement.getElementsByTagName("JetName").item(0).getTextContent());
				System.out.println("Price Per Day : " + eElement.getElementsByTagName("PricePerDay").item(0).getTextContent());
				System.out.println("Start Date : " + eElement.getElementsByTagName("startDate").item(0).getTextContent());
				System.out.println("End Date : " + eElement.getElementsByTagName("endDate").item(0).getTextContent());
				System.out.println("Max Number of Guests : " + eElement.getElementsByTagName("MaxGuests").item(0).getTextContent());
				System.out.println("Number of Rooms : " + eElement.getElementsByTagName("NumberRooms").item(0).getTextContent());
				System.out.println("Is Bedroom Available : " + eElement.getElementsByTagName("BedroomAvailable").item(0).getTextContent());
				System.out.println("Number of Bathrooms : " + eElement.getElementsByTagName("Bathrooms").item(0).getTextContent());			

			}
		}//end for loop
	}// end method 
			
}//end class

		

		
