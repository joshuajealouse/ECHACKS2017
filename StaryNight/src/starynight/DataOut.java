/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starynight;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author JoshJ
 */
/*
public class StaryNight extends JApplet {
    String test ;
    public void init()
    {
        test = "Hello World!!";
    }
}
*/
public class DataOut {

    /**
     * @param args the command line arguments
     * @throws IOException https://echacks2.slack.com/archives/C7RHAPX0B/p1509816040000079
     */
    public static void main(String[] args) throws IOException
    {
    	Scanner input = new Scanner (System.in);
    	System.out.println("What is the city name?");
    	String city = input.next();
    	input.close();
    	
    	WeatherData data = new WeatherData();
    	String cityName = data.XMLFile("city", "name", city);
    	String windSpeed = data.XMLFile("speed", "name", city);
    	String maxTemp = data.XMLFile("temperature", "max", city); //parse to double -> double d = parseDouble(max);
    	String minTemp = data.XMLFile("temperature", "min", city);
    	String descripCloud = data.XMLFile("clouds", "name", city);
    	String valueCloud = data.XMLFile("clouds", "value", city);
    	String weatherType = data.XMLFile("weather", "value", city);
    	String airPressure = data.XMLFile("pressure", "value", city);
    	
    	//PollutionIndex datas = new PollutionIndex();
    	//datas.url();
    	
    }
    /* To be reopened at a later point
    public void paint(Graphics screen)
    {
        Graphics2D screen2D = (Graphics2D) screen;
        
        screen2D.drawString(test, 100, 75);
    }
    */
}
