//**********************************************//
//* Author:1717859                             *//
//*                                            *//
//* Element:Assignment 2 Resit                 *//
//*                                            *//
//* Description:The director login class to    *//
//* read in the director username and password *//
//* Date:5th August 2019                       *//
//*                                            *//
//**********************************************//

import java.util.Scanner;

public class DirectorLogin extends Login
{
	
	// class instance fields
	private static String directorUsername = " ";
	private static String directorPassword = " ";
	
	//User entry converted from string to int
	private static Scanner enterDirectorSelections = new Scanner(System.in);
	
	// constructor
	public DirectorLogin()
	{
		//Calls the constructor of the parent superclass Login
		super();
		System.out.println("Director Logins");
		
		//Director Login
		System.out.println("Please, enter the Director username:  ");
		directorUsername = enterDirectorSelections.nextLine();
		System.out.println("Please, enter the Director password:  ");
		directorPassword = enterDirectorSelections.nextLine();	
	}
	
	// Polymorphism with Override 
	//To bind the method from the sub class in response to the call from the super class.
	
	// getter method for instance field username
	public static String getUsername()
	{
		return directorUsername;
	}
	
	// setter method for instance field username 
	public static void setUsername(String aUsername)
	{
		directorUsername = aUsername;
	}
	
	// getter method for instance field password
	public static String getPassword()
	{
		return directorPassword;
	}
	
	// setter method for instance field password 
	public static void setPassword(String aPassword)
	{
		directorPassword = aPassword;
	}
}//end class