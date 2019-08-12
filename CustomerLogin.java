//**********************************************//
//* Author: 1717859                            *//
//* Week:                                      *//
//* Element:Resit Element 011                  *//
//*                                            *//
//* Description:The Customer Login Class to    *//
//*read in the customer username and password  *//
//*                                            *//
//* Date:  4th August 2019                     *//
//*                                            *//
//**********************************************//
import java.util.Scanner;

//inheritance from class Login
public class CustomerLogin extends Login
{
	
	// class instance fields
	private static String customerUsername = " ";
	private static String customerPassword = " ";
	//read in customer option number
	private static Scanner inputCustomerOptions = new Scanner(System.in);
	
	// constructor
	public CustomerLogin()
	{
		//Calls the constructor of the parent superclass Login
		super();
		System.out.println("Customer Logins");
		
	    //Customer Login
		System.out.println("Please, enter the Customer username:  ");
		//converts string to int
		customerUsername = inputCustomerOptions.nextLine();
		System.out.println("Please, enter the Customer password:  ");
		//converts string to int
		customerPassword = inputCustomerOptions.nextLine();	
	}
	
	// Polymorphism with Override
	//To bind the method from the sub class in response to the call from the super class.
	
	
	// getter method for instance field username
	public static String getUsername()
	{
		return customerUsername;
	}
	
	// setter method for instance field username 
	public static void setUsername(String aUsername)
	{
		customerUsername = aUsername;
	}
	
	// getter method for instance field password
	public static String getPassword()
	{
		return customerPassword;
	}
	
	// setter method for instance field password 
	public static void setPassword(String aPassword)
	{
		customerPassword = aPassword;
	}
	
	

}//endclass