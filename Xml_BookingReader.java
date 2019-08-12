//**********************************************//
//* Author:1717859                             *//
//*                                            *//
//* Element:Assignment 2 Resit                 *//
//* Description:write xml bookings              *//
 //* bookings                                  *//
//* Date:8th August 2019                         *//
//*                                            *//
//**********************************************//

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class Xml_BookingReader extends XML_Reader
{
	private static String theFilename = "D:/Bookings.xml";
	private static Document aReservationDocument;
	// constructor
	public Xml_BookingReader()
	{
		System.out.println("Show me the bookings...!");
		
		aReservationDocument = serverFileConnection(theFilename);
		setDocument(aReservationDocument);
	}
	
	public static Document getDocument()
	{
		return aReservationDocument; 
	}
	
	public static void setDocument(Document myDoc)
	{
		aReservationDocument = myDoc;
	}
		
	
	// implementing the inherited abstract method
	// so there is a method body this time
	public void textDisplay(Document theDoc)
	{		
	    theDoc = getDocument();
		System.out.println("Root element :" + theDoc.getDocumentElement().getNodeName());
			
		NodeList nList = theDoc.getElementsByTagName("Booking");
				
		System.out.println("----------------------------");

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
					
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
					
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eElement = (Element) nNode;

				System.out.println("Booking ID : " + eElement.getAttribute("id"));
				System.out.println("First Name : " + eElement.getElementsByTagName("FirstName").item(0).getTextContent());
				System.out.println("Last Name : " + eElement.getElementsByTagName("LastName").item(0).getTextContent());
				System.out.println("Start Date : " + eElement.getElementsByTagName("startDate").item(0).getTextContent());
				System.out.println("End Date : " + eElement.getElementsByTagName("endDate").item(0).getTextContent());
				System.out.println("Max Number of Guests : " + eElement.getElementsByTagName("MaxGuests").item(0).getTextContent());				
				System.out.println("Do you need Catering : " + eElement.getElementsByTagName("Catering").item(0).getTextContent());			

			}
		}//end for loop 
	}// end method 
		
}//end Class
		


