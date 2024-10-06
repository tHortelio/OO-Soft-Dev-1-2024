package com.mycompany.thermtest;

/**Student name: Lucas Hortelio
 * Student N:C00303476
 * Date: 05/10/2024
 */
public class ThermTest {

    public static void main(String[] args) {
        
        Thermometer thermA = new Thermometer();	// Create an instance of our Thermometer class

        System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
	thermA.setCelsius(20.0);
	System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
        
        Thermometer thermB = new Thermometer(10.0); //Create a second instance of Thermometer class
        
        double tempB = thermB.getCelsius(); //create variable to store celsius temp of ThermB
        
        System.out.println("Temp. of Thermometer B is: " + tempB);
        
        //get Fahrenheit
        
        tempB = thermB.getFahrenheit();//convert tempB from Celsius to Fahrenheit
        
        System.out.println("Temperature of Therm B in Fahrenheit is: " + tempB);
        
        //set Fahrenheit
        
        thermB.setFahrenheit(100);//sets temp in Fahrenheit

        tempB = thermB.getCelsius();//converts it to Celsius
        
        System.out.println("Temperature of Therm B is: " + thermB.getCelsius());
        
    }//end main
}//end class
