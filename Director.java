//**********************************************//
//* Author: 1717859                             *//
//*                                            *//
//* Element:    Assignment 2                   *//
//* Description:  Director class for viewing   *//
//* and confirmation of bookings               *//
//* Date:9th August 2019                       *//
//*                                            *//
//**********************************************//

import java.util.Scanner;
import javax.swing.JOptionPane;
import org.w3c.dom.Document;
import javax.swing.*;

public class Director extends User
{

	
	private static Document reservationDocument;
	private static Xml_BookingReader myXMLReservationReader;
	
	private static Document reservationConfirmationDocument;
	private static Xml_ConfirmationReader myXMLReservationConfirmationReader;
	
	// sub-class constructor
	public Director()
	{
		super();
		System.out.println("Director User");
	}
	
	public static void editBooking(int aBookingID)
	{
		
	}
	
	public static void editAirPlane(String JetPlane)
	{
		
	}
	//View All bookings 
	public static void viewAllBookings()
	{
		myXMLReservationReader = new Xml_BookingReader();
		reservationDocument = myXMLReservationReader.getDocument();
		
		myXMLReservationReader.textDisplay(reservationDocument);
		
	}
	//view all confirmations.
	public static void viewAllConfirmations()
	{
		myXMLReservationConfirmationReader = new Xml_ConfirmationReader();
		reservationDocument = myXMLReservationConfirmationReader.getDocument();
		
		myXMLReservationConfirmationReader.textDisplay(reservationDocument);
		
	}
	
}//end Class