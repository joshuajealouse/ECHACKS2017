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
	public String XMLFile (String elementName, String attrName, String city) 
	{
		//Document xmlDoc = getDocument("./src/weatherdata.xml");
		Document xmlDoc = getDocument("http://api.openweathermap.org/data/2.5/weather?q="+city+"&mode=xml&units=metric&appid=5fc3e373e9ceb862d37b4824836bb81e#"); //declaring the xml as a Document
		xmlDoc.getDocumentElement();					//Get the name of root element
		//System.out.println(xmlDoc.getDocumentElement().getNodeName());//xmlDoc.getDocumentElement().getNodeName();		//Check if this is needed for program, as not using root
		
		NodeList listOfValues = xmlDoc.getElementsByTagName("current"); //change 'tagname' in brackets to the element name
		
		return getElementAndAttrib(listOfValues, elementName, attrName);
	}
	/*
	 * Define getDocument and start the parse of the XML file
	 */
	private Document getDocument(String docString) {
		try
		{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			
			factory.setIgnoringComments(true);
			factory.setIgnoringElementContentWhitespace(true);
			factory.setValidating(false);
			factory.setNamespaceAware(true);
			
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
				
				Element elementElement = (Element)elementNode; //Access node info
				
				NodeList attrNode = elementElement.getElementsByTagName(elementName);
				
				Element attrElement = (Element)attrNode.item(0);
				
				if (attrElement.hasAttribute(attrName))
				{
					return(attrElement.getAttribute(attrName)); 
				}
				else 
				{
					
				}
			}
		}
		catch(Exception ex)
		{
			return ex.getMessage();
		}
		return null;
	}

}
