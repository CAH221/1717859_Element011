//**********************************************//
//* Author:1717859                             *//
//*                                            *//
//* Element: Assignment 2 Resit                *//
//* Description:The xml confirmation writer    *//
//*produces a confirmation for the user        *//
//* Date:8th August 2019                       *//
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
public class Xml_ConfirmationReader extends XML_Reader
{
	//Instantiate instance fields 
	private static String theFilename = "D:/BookingConfirmations.xml";
	private static Document aReservationConfirmationDocument;
	
	// constructor
	public Xml_ConfirmationReader()
	{
		System.out.println("Show me the booking confirmations...!");
		
		//connect to server
		aReservationConfirmationDocument = serverFileConnection(theFilename);
		setDocument(aReservationConfirmationDocument);
	}
	
	//getter method
	public static Document getDocument()
	{
		return aReservationConfirmationDocument; 
	}
	
	//setter method
	public static void setDocument(Document myDoc)
	{
		aReservationConfirmationDocument = myDoc;
	}
		
	
	// implementing the inherited abstract method
	// so there is a method body this time
	public void textDisplay(Document theDoc)
	{		
		//get the document and root element and node
	    theDoc = getDocument();
		System.out.println("Root element :" + theDoc.getDocumentElement().getNodeName());
		//tag name confirmation
		NodeList nList = theDoc.getElementsByTagName("Confirmation");
				
		System.out.println("----------------------------");
        
		//loop  through the element and attribute list
		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
					
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
			
			//for exceptions
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eElement = (Element) nNode;
                
				//print all booking confirmation information
				System.out.println("Booking Confirmation ID : " + eElement.getAttribute("id"));
				System.out.println("First Name : " + eElement.getElementsByTagName("FirstName").item(0).getTextContent());
				System.out.println("Last Name : " + eElement.getElementsByTagName("LastName").item(0).getTextContent());
				System.out.println("Start Date : " + eElement.getElementsByTagName("startDate").item(0).getTextContent());
				System.out.println("End Date : " + eElement.getElementsByTagName("endDate").item(0).getTextContent());
				System.out.println("Confirmed Jet : " + eElement.getElementsByTagName("ConfirmedPlane").item(0).getTextContent());
				System.out.println("Max Number of Guests : " + eElement.getElementsByTagName("MaxGuests").item(0).getTextContent());
				System.out.println("Number of Rooms : " + eElement.getElementsByTagName("CabinRooms").item(0).getTextContent());
				System.out.println("Is Bedroom Available : " + eElement.getElementsByTagName("Bedroom").item(0).getTextContent());
				System.out.println("Number of Bathrooms : " + eElement.getElementsByTagName("Bathrooms").item(0).getTextContent());	
				System.out.println("Is Catering Included : " + eElement.getElementsByTagName("Catering").item(0).getTextContent());	
				System.out.println("Total Price (Jet Plane Costs plus Catering Costs : " + eElement.getElementsByTagName("TotPrice").item(0).getTextContent());	

			}
		}//end for loop 
	}// end method 

		
}//end class
