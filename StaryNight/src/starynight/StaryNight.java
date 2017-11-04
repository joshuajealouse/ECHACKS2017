/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starynight;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
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
public class StaryNight {

    /**
     * @param args the command line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException
    {
    	WeatherData data = new WeatherData();
    	System.out.println(data.XMLFile("city", "name"));
    	System.out.println(data.XMLFile("speed", "name"));
    	System.out.println(data.XMLFile("temperature", "max")); //parse to double -> double d = parseDouble(max);
    	System.out.println(data.XMLFile("temperature", "min"));
    	System.out.println(data.XMLFile("clouds", "name"));
    	System.out.println(data.XMLFile("weather", "value"));
    	System.out.println(data.XMLFile("pressure", "value"));
    	
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
