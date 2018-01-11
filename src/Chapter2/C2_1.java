package Chapter2;

import java.util.Scanner;

/**
 * Program to showcase the usage of a Scanner, as well as the nextDouble
 * conversion
 *
 * @author Douglas McDaniel (dm0928293)
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        double fahrenheit, celsius;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius: ");
        celsius = input.nextDouble(); //user input is stored in 'celsius'
        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }

}
