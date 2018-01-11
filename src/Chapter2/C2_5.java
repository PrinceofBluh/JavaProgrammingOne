package Chapter2;

import java.util.Scanner;

/**
 * Program to showcase the mathematical use of doubles within a program
 *
 * @author Douglas McDaniel (dm0928293)
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        double subtotal, gratuity, total;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal:");
        subtotal = input.nextDouble(); //user input goes to subtotal
        System.out.println("Enter the gratuity rate: ");
        gratuity = (input.nextDouble() / 100) * subtotal;   //user input divided by 100 goes and multiplied by the subtotal goes to gratuity          
        total = gratuity + subtotal; //total is calculated 
        System.out.println("the gratuity is $" + gratuity + " and the total is $" + total);

    }

}
