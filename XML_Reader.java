//**********************************************//
//* Author:1717859                             *//
//*                                            *//
//* Element:Assignment 2 Resit                 *//
//* Description:Inheritance and Abstract class *//
//* to read the xml file.                      *//
//*                                            *//
//* Date:6th August 2019                       *//
//*                                            *//
//**********************************************//
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

//abstract class that contains one abstract method and requires sub class for Implementation
public abstract class XML_Reader
{
	
	//instance fields
	private static File aXMLFile;
	private static DocumentBuilderFactory dbFactory;
	private static DocumentBuilder mydocBuilder;
	private static Document mydoc;
	
	// super class constructor
	public XML_Reader()
	{
		System.out.println("Reading a file");
	}
	
	public static Document serverFileConnection(String afilename)
	{
		try//to catch errors 
		{
			//instantiate your objects
			aXMLFile = new File(afilename);
			dbFactory = DocumentBuilderFactory.newInstance();
			mydocBuilder = dbFactory.newDocumentBuilder();
			mydoc = mydocBuilder.parse(aXMLFile);
					
			//Node Normalized to represent string in a Straight line instead of confused in memory. 
			mydoc.getDocumentElement().normalize();
			
			
		} catch (Exception e) //to catch exceptions
		{
			e.printStackTrace();
		}
		
		//return the document read
		return mydoc;
    }
	
	// abstract method
	// so there is no method body
	public abstract void textDisplay(Document aDoc);
	
}//end class

