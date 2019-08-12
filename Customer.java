//**********************************************//
//* Author: 1717859                             *//
//*                                            *//
//* Element:    Assignment 2                   *//
//* Description: Customer class reads airplane  *//
//*  reader  and extends user to implement      *//
//*  XML_BookingWriter and XML_JetPlanesReader *//
//* Date:  9th August 2019                     *//
//*                                            *//
//**********************************************//

import java.util.Scanner;
import javax.swing.JOptionPane;
import org.w3c.dom.Document;
import javax.swing.*;

public class Customer extends User
{

	//Calls XML_Jetplanes reader and XML_BookingWriter
	private static Xml_JetPlanesReader myXMLAirPlaneReader;
	private static Document planesDocument;
	
	private static Xml_BookingWriter myXMLReservationWriter;
	
	private int BID = 0;
	
	// sub-class constructor
	public Customer()
	{
		super();
		System.out.println("Customer User");
	}
	
	public static void editBooking(int aBookingID)
	{
		
	}
	
	/*public static void doBooking(String jetPlaneName, int start, int endDate,
								int maxGuests, boolean catering, int bathrooms)*/
	public void doBooking()
	{
		// READER
		myXMLAirPlaneReader = new Xml_JetPlanesReader();
		planesDocument = myXMLAirPlaneReader.getDocument();
		
		myXMLAirPlaneReader.textDisplay(planesDocument);
		System.out.println(" 												");
		System.out.println(" 												");
		// WRITER
		myXMLReservationWriter = new Xml_BookingWriter();
		myXMLReservationWriter.bookingWriter(++BID);
		//myXMLReservationWriter.bookingWriter(++BID);
		
	}
	
}//end Class
