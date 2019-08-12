//**********************************************//
//* Author:1717859                             *//
//*                                            *//
//* Element:Assignment 2 Resit                 *//
//* Description: The booking writer method to  *//
//*  write a new booking                        *//
//* Date:8th August 2019                       *//
//*                                            *//
//**********************************************//
//Protected constructor to prevent instantiation.
import javax.xml.parsers.DocumentBuilderFactory;

//Document from xml using the class
import javax.xml.parsers.DocumentBuilder;

//root document tree and provides access to documents data
import org.w3c.dom.Document;

//Access to all the main tag node list
import org.w3c.dom.NodeList;

//access to individual node
import org.w3c.dom.Node;

//primary datatype for entire document model
import org.w3c.dom.Element;

//import class in java input/output package
import java.io.File;

//Handling exception
import java.io.IOException;

//collections of nodes that can be accessed by name
import org.w3c.dom.NamedNodeMap;

//Create a new ParserConfigurationException constructor with no detail message
import javax.xml.parsers.ParserConfigurationException;

//Defualt constructor protected
import javax.xml.transform.Transformer;

//Creates a new transformer exception
import javax.xml.transform.TransformerException;

//Creates transformer templates
import javax.xml.transform.TransformerFactory;

//Acts as a holder for the document model
import javax.xml.transform.dom.DOMSource;

//Acts as a transformation holder for xml result
import javax.xml.transform.stream.StreamResult;

public class XML_Writer
{
	
	//instance fields for writer
	private static File myXMLWriteFile;
	private static DocumentBuilderFactory dbWriterFactory;
	private static DocumentBuilder mydocWriteBuilder;
	private static Document myWritedoc;
	private static Element rootElement;
	private static Node rootNode;
	private static Node booking;
	private static String myXMLWriteFilepath = "";
	
	// super class constructor
	public XML_Writer()
	{
		System.out.println("Writing to a file");
	}
	
	//server connection
	public static Document serverFileConnection(String afilename)
	{
		try 
		{
			//instantiate your objects			
			myXMLWriteFilepath = "D:/Bookings.xml";
			dbWriterFactory = DocumentBuilderFactory.newInstance();
			mydocWriteBuilder = dbWriterFactory.newDocumentBuilder();
			myWritedoc = mydocWriteBuilder.parse(myXMLWriteFilepath);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
		return myWritedoc;
    }

}//end class