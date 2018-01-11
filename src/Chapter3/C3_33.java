package Chapter3;

import java.util.Scanner;

/**
 * Program to determine which package has the better price via user input
 *
 * @author Douglas McDaniel (dm0928293)
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        double weight1, price1, pricePerPound1;
        double weight2, price2, pricePerPound2;
        Scanner input = new Scanner(System.in); //creates scanner

        System.out.println("Enter the weight of package 1: ");
        weight1 = input.nextDouble(); //user input 
        System.out.println("Enter the price of package 1: ");
        price1 = input.nextDouble(); //user input
        System.out.println("Enter the weight of package 2: ");
        weight2 = input.nextDouble(); //user input
        System.out.println("Enter the price of package 2: ");
        price2 = input.nextDouble(); //user input

        pricePerPound1 = weight1 / price1; //priceperpound found by dividing the weight and price of the first package
        pricePerPound2 = weight2 / price2; //same as above but for pacakge 2

        if (pricePerPound1 < pricePerPound2) //if package 1 is cheaper than package 2 per pound
        {
            System.out.println("Package 1 has a better price");
        } else if (pricePerPound2 < pricePerPound1) //if package 2 is cheaper than package 1 per pound
        {
            System.out.println("Package 2 has a better price");
        } else {
            System.out.println("The packages have the same price"); //if both packages have the same price per pound
        }
    }

}
