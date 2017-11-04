/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starynight;

import org.xml.sax.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;

/**
 *
 * @author TDeep
 */
public class WeatherData {

    /*
     * Pulling Data from external file
     */
	public void XMLFile () 
	{
		Document xmlDoc = getDocument("./src/weatherdata.xml"); //declaring the xml as a Document
		xmlDoc.getDocumentElement();
		xmlDoc.getDocumentElement().getNodeName();
		
		NodeList listOfValues = xmlDoc.getElementsByTagName("city"); //change 'tagname' in brackets to the element name
		
		String elementName = "city";
		String attrName = "name";
		
		getElementAndAttrib(listOfValues, elementName, attrName);
	}
	//Define getDocument
	private Document getDocument(String docString) {
		try
		{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			
			factory.setIgnoringComments(true);
			factory.setIgnoringElementContentWhitespace(true);
			factory.setValidating(true);
			
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			return builder.parse(new InputSource(docString));

		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}
	/*
	 * Method : getElementAndAttrib
	 */
	private static String getElementAndAttrib(NodeList listOfValues, String elementName, String attrName )
	{
		try
		{
			for (int i=0; i<listOfValues.getLength(); i++)
			{
				Node elementNode = listOfValues.item(i); //Get node of city
				
				Element elementAttr = (Element)elementNode; //Access node info
				
				NodeList attrNode = elementAttr.getElementsByTagName(elementName);
				
				Element attrElement = (Element)attrNode.item(0);
				
				NodeList attrList = attrElement.getChildNodes();
				
				if (attrElement.hasAttribute(attrName))
				{
					System.out.println(attrElement.getAttribute(attrName)); 
				}
				else 
				{
					
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	
	/*
	 * Sorts the data into multiple parameters
	 */
	
	
	/*
	 * Refresh Method
	 */
	
	
	/*
	 * Outputs to another file
	 */

}
