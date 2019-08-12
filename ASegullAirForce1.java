//**********************************************//
//* Author: 1717859                            *//
//* Week:                                      *//
//* Element:Resit Element 011                  *//
//*                                            *//
//* Description:The text based menu system     *//
//*login for both the director and customer.   *//
//*                                            *//
//* Date:  4th August 2019                     *//
//*                                            *//
//**********************************************//

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;

public class ASegullAirForce1
{
	
	// hardcoded username and password;
	// Customer username and password
	private final static String customerUsername = "Zack";
	private final static String customerPassword = "1234";
	// AirlineDirector username and password
	private final static String directorUsername = "Tommy";
	private final static String directorPassword = "1234";
	//Options for text based menu
	private static Scanner inputOptionNumber = new Scanner(System.in);
	//SelectionNumber -1 to exit
	private static int selectionNumber = -1;
    //Changing Class Customer and DirectorLogin so values can be passed
	private static CustomerLogin aCustomerLogin;
	private static DirectorLogin aDirectorLogin;
	//Changing Customer and Director login so values can be passed
	private static Customer aCustomer;
	private static Director aDirector;
	//Initializing  counter to zero
	private static int counter = 0;
	
	//The customer Text Display with Options
	public static void customerTextMenu()
	{
		System.out.println(" ================================================================= ");
		System.out.println("                               Segull AirForce 1                   ");
		System.out.println(" ================================================================= ");
		System.out.println("                                                                   ");
		System.out.println("                               Customer Options                      ");
		System.out.println(" ----------------------------------------------------------------- ");
		System.out.println("                     1. Do a Booking                               ");
		System.out.println("                     2. Manage a Booking                           ");
		System.out.println("                     3. EXIT                                       ");
		System.out.println(" ----------------------------------------------------------------- ");
	}
	
	//The Director text Display with Options
	public static void directorTextMenu()
	{
		System.out.println(" ================================================================= ");
		System.out.println("                           Segull AirForce 1                       ");
		System.out.println(" ================================================================= ");
		System.out.println("                                                                   ");
		System.out.println("                               Director Options                     ");
		System.out.println(" ----------------------------------------------------------------- ");
		System.out.println("                     1. View All Bookings                          ");
		System.out.println("                     2. Manage a Booking                           ");
		System.out.println("                     3. EXIT                                       ");
		System.out.println(" ----------------------------------------------------------------- ");
	}
	
	public static void main(String[] args)
	{		
		//Counter Loop for 3 attempts to login for both director and Customer
		while (counter < 3)
		{
			
			System.out.println(" ================================================================= ");
			System.out.println("                          Segull AirForce 1                        ");
			System.out.println(" ================================================================= ");
			System.out.println(" Please, enter '1' for Customer Login or enter '2' for Director Login");
			
			//converting read in string to int
			selectionNumber = inputOptionNumber.nextInt();
	        
			//if selection number = 1 then
			if (selectionNumber==1)
			{
				// instantiating a CustomerLogin object
				aCustomerLogin = new CustomerLogin();
				// instantiating the Customer object
				aCustomer = new Customer();
				
				//if the customer Username and Customer password match then  call Customer Login class and get user name and Call Customer Login Class and get Password
				if ( (customerUsername.equals(aCustomerLogin.getUsername())) && (customerPassword.equals(aCustomerLogin.getPassword())) )
				{
					//If counter ==3 Then Customer has logged on
					counter = 3;
					// Customer Successful Login
					System.out.println("Customer has logged on successfully! ");
					
					// calling method customerTextMenu for displaying the main Customer Options
					customerTextMenu();
					System.out.println(" Please, enter '1' or '2' or '3' for Customer Options");
					//Converting read in string to int
					selectionNumber = inputOptionNumber.nextInt();
			        //if SelectionNumber ==1 then call
					if (selectionNumber==1)
					{   
						//The do Booking Method
						aCustomer.doBooking();
					}
					
				}
			}
			//if selection number ==2 then 
			else if (selectionNumber==2)
			{
				// instantiating a DirectorLogin object
				aDirectorLogin = new DirectorLogin();
				// instantiating the Director object
				aDirector = new Director();
				
				//if the director username and director password match then call director login method.
				if ( (directorUsername.equals(aDirectorLogin.getUsername())) && (directorPassword.equals(aDirectorLogin.getPassword())) )
				{
					counter = 3; 
					
					// Director Successful Login
					System.out.println("Director has logged on successfully! ");
					
					// calling method directorTextMenu for displaying the main Director Options
					directorTextMenu();
					
					System.out.println(" Please, enter '1' or '2' or '3' for Director Options");
					//convert string to int
					selectionNumber = inputOptionNumber.nextInt();
			        //if selection number ==1 then
					if (selectionNumber==1)
					{
						
						//view all bookings
						aDirector.viewAllBookings();
						System.out.println(" 	                                            ");
						System.out.println(" 												");
						//view all confirmations
						aDirector.viewAllConfirmations();
					}
				}
			}
			//else show wrong option message
			else
			{			
				JOptionPane.showMessageDialog(null, "Wrong Option Number!");
				
				counter = counter + 1;
			}
		
		}//end while
		
		
		
	}//endMain
	
	
	
}//endClass