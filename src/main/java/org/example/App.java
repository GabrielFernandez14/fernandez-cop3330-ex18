/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 18 - Temperature Converter
 */

package org.example;

// Import required libraries
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        String msg = "";
        String f2c = "Please enter the temperature in Fahrenheit:";
        String c2f = "Please enter the temperature in Celsius:";

        // Prompt user for input and record their choice
        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                            "Press F to convert from Celsius to Fahrenheit.");
        Scanner choiceIn = new Scanner(System.in);
        String choice = choiceIn.next();
        System.out.println("Your choice: " + choice);

        // Limit any variable called by df.format() to two decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        // Check to see if the user's choice was Celsius to Fahrenheit conversion
        if (choice.equals("C") || choice.equals("c")) {
            System.out.println(f2c);
            Scanner fTempIn = new Scanner(System.in);
            double fTemp = fTempIn.nextDouble();
            // Calculate Celsius to Fahrenheit conversion and print
            double cTempOutput = ((fTemp - 32) * 5) / 9;
            msg = "The temperature in Celsius is " + df.format(cTempOutput) + ".";
        }
        // Check to see if the user's choice was Fahrenheit to Celsius conversion
        else if (choice.equals("F") || choice.equals("f")) {
            System.out.println(c2f);
            Scanner cTempIn = new Scanner(System.in);
            double cTemp = cTempIn.nextDouble();
            // Calculate the conversion and print
            double fTempOutput = ((cTemp * 9) / 5) + 32;
            msg = "The temperature in Fahrenheit is " + df.format(fTempOutput) + ".";
        }
        // The user entered an invalid input, so just end the program since
        // I don't feel like messing with loops
        else {
            System.out.println("That is not a valid input, please restart the program.");
        }

        System.out.println(msg);
    }
}
