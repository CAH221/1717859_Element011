//**********************************************//
//* Author:1717859                             *//
//*                                            *//
//* Element:Assignment 2  Resit                *//
//* Description:The XML booking writer to read *//
//*in the customer booking information.        *//
//* Date:8th August 2019                       *//
//*                                            *//
//**********************************************//

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import java.io.IOException;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

//Polymorphism parent class and sub class XML_Writer
public class Xml_BookingWriter extends XML_Writer
{
	//write to bookings xml
	private static String theWriteFilename = "D:/Bookings.xml";
	//create Document
	private static Document aWriteBookingDocument;
	//create node
	private static Node booking;
	//create string
	private static String myXMLWriteFilepath = "D:/Bookings.xml";
	//create a new instance of Document
	private static Document theBookingWriting;
	//input reservation selections
	private static Scanner ReservationSelections = new Scanner(System.in);
	
	//instance fields for input
	private static String bookingFirstName = "";
	private static String bookingLastName = "";
	private static int start = -1;
	private static int end = -1;
	private static int maximumGuests = -1;
	private static String catering = "";
	private static String exit ="";
	//Instance filed for root node
	private static Node rootNode;
	
	// constructor
	public Xml_BookingWriter()
	{
		System.out.println("Write me the bookings...!");
		//connect to  server to write file
		aWriteBookingDocument = serverFileConnection(theWriteFilename);
		setDocument(aWriteBookingDocument);
	}
	//getter method
	public static Document getDocument()
	{
		return aWriteBookingDocument; 
	}
	//setter method
	public static void setDocument(Document myDoc)
	{
		aWriteBookingDocument = myDoc;
	}
	
	public static void bookingWriter(int bookingWritingID) //String aWriteFilePath)
	{
		try
		{
			theBookingWriting = getDocument();	
			// Get the booking element by tag name directly
			booking = theBookingWriting.getElementsByTagName("Booking").item(0);
						
			// update booking attribute
			NamedNodeMap attr = booking.getAttributes();
			Node nodeAttr = attr.getNamedItem("id");
			nodeAttr.setTextContent(String.valueOf(bookingWritingID));
				
			NodeList list = theBookingWriting.getElementsByTagName("Booking");  //getChildNodes();
			
			Node node = list.item(bookingWritingID);//list items in booking writer
			Element eElement = (Element) node;
			
			//read in customer booking information
			System.out.println("Start your Fantastic booking...");
			System.out.println("*******************************");
				
			System.out.println("Please enter your first name:  ");
			bookingFirstName = ReservationSelections.nextLine();
			eElement.getElementsByTagName("FirstName").item(0).setTextContent(bookingFirstName);
			
			System.out.println("Please enter your last name:  ");
			
			bookingLastName = ReservationSelections.nextLine();
			eElement.getElementsByTagName("LastName").item(0).setTextContent(bookingLastName);
		
			System.out.println("Please enter your preferred booking start date:  ");
			start = ReservationSelections.nextInt();
			eElement.getElementsByTagName("startDate").item(0).setTextContent(String.valueOf(start));
			
			System.out.println("Please enter your preferred booking end date:  ");
			end = ReservationSelections.nextInt();
			eElement.getElementsByTagName("endDate").item(0).setTextContent(String.valueOf(end));
					
			System.out.println("Please enter 'Yes' or 'No' for your catering preference:  ");
			catering = ReservationSelections.nextLine();
			eElement.getElementsByTagName("Catering").item(0).setTextContent(catering);
			
			exit = ReservationSelections.nextLine();
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(theBookingWriting);
			StreamResult result = new StreamResult(new File(myXMLWriteFilepath));			
			transformer.transform(source, result);
		}
		//catch exception
		catch(TransformerException tfe)
		{
			tfe.printStackTrace();
		}		
			
	}//end method
	
}//end class


