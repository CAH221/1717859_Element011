//**********************************************//
//* Author:1717859                             *//
//*                                            *//
//* Element:Assignment 2 Resit                 *//
//*                                            *//
//* Description:Class login sets and gets the  *//
//* username and password so it can be called in*//
//* director login and customer login          *//
//* Date:6th August 2019                       *//
//*                                            *//
//**********************************************//

public class Login extends User
{
	
	// class instance fields
	private static String username = " ";
	private static String password = " ";
	
	// constructor
	public Login()
	{
		System.out.println("User Logins");
	}
	
	// getter method for instance field username
	public static String getUsername()
	{
		return username;
	}
	
	// setter method for instance field username 
	public static void setUsername(String aUsername)
	{
		username = aUsername;
	}
	
	// getter method for instance field password
	public static String getPassword()
	{
		return password;
	}
	
	// setter method for instance field password 
	public static void setPassword(String aPassword)
	{
		password = aPassword;
	}
}//end Class

