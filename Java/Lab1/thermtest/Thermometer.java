package com.mycompany.thermtest;

/**
 *
 * @author Lucas Hortelio
 */
public class Thermometer {
    
    private double celsius;	
							
	// constructor method #1
	public Thermometer(){
		setCelsius(0);		
	}
	
        // constructor method #2
	public Thermometer(double cel){
		setCelsius(cel);
	}

        //Getter&Setter
	public void setCelsius(double cel){
		celsius = cel;		
	}

	public double getCelsius(){
		return celsius;
	}
    
        public void setFahrenheit(double fahrenheit){
                celsius = (((fahrenheit -32)*5)/9);
        }
        
        public double getFahrenheit(){
                return(((celsius*9)/5)+32);
        }
        
}//end class thermometer
