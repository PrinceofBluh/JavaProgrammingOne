package Chapter2;
import java.util.Scanner;
/**
 * Program to calculate the cost of a meal via user input
 *
 * @author Douglas McDaniel (dm0928293)
 */

public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        double meal, drink, dessert, subtotal, tax, tip, totalcost;
        Scanner input = new Scanner(System.in); //create user input

        System.out.println("Enter the price of your meal: ");
        meal = input.nextDouble(); //user input stored in meal

        System.out.println("Enter the price of your drink: ");
        drink = input.nextDouble(); //user input stored in drink

        System.out.println("Enter the price of your dessert: ");
        dessert = input.nextDouble(); //user input stored in dessert

        subtotal = meal + drink + dessert; //all user input added into subtotal

        tax = subtotal * .10; //tax calculated as 10% of the subtotal of all user input
        tip = (subtotal + tax) * .15; //tip calculated as 15% of the subtotal plus tax
        totalcost = subtotal + tax + tip; //total cost added as subtotal, tax and tip

        System.out.println("Price of Entire Meal: " + subtotal
                + "\nTax: " + tax
                + "\nTip: " + tip
                + "\nTotal Cost: " + totalcost); //all variables outputted

    }
}
