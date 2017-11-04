/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starynight;
import javax.swing.*;
import java.awt.*;
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
     */
    public static void main(String[] args)
    {
    	WeatherData data = new WeatherData();
    	System.out.println(data.XMLFile("city", "name"));
    	System.out.println(data.XMLFile("speed", "name"));
    	
    }
    /* To be reopened at a later point
    public void paint(Graphics screen)
    {
        Graphics2D screen2D = (Graphics2D) screen;
        
        screen2D.drawString(test, 100, 75);
    }
    */
}
