/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconversion;

import java.util.Scanner;
        
/**
 *
 * @author nagimohsen
 */
public class TempConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Farenheit Calculation
        
                
      
        Scanner far = new Scanner(System.in);
        double fare, cell;
        System.out.print("Enter a temperature in Farenheit: ");
        fare = far.nextDouble();
        cell = (( fare - 32)*5)/9;
        //((temperature - 32)*5)/9
        
        System.out.println(fare + " °F = " + cell + " °C");
        
        
        
        
        //Celsius Calculation
        Scanner cel = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Enter a temperature in Celsius: ");
        celsius = cel.nextDouble();
        fahrenheit = 32 + ( celsius * 9 / 5);
        System.out.println(celsius + " °C = " + fahrenheit + " °F");

    }
    
}
