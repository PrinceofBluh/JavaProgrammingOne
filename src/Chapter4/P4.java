package Chapter4;
import java.util.Scanner;
/**
 * Program to determine the details of two bidders and which is more cost
 * effective
 *
 * @author Douglas McDaniel (dm0928293)
 */

public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name1, name2;
        int hours1, hours2;
        double charge1, charge2;
        double cost1, cost2;

        //bidder 1
        System.out.println("What is the name of the first bidder?");
        name1 = input.next();

        System.out.println("How many hours of work will " + name1 + " require?");
        hours1 = input.nextInt();

        System.out.println("How much does " + name1 + " charge per hour?");
        charge1 = input.nextDouble();

        //bidder 2
        System.out.println("What is the name of the second bidder?");
        name2 = input.next();

        System.out.println("How many hours of work will " + name2 + " require?");
        hours2 = input.nextInt();

        System.out.println("How much does " + name2 + " charge per hour?");
        charge2 = input.nextDouble();

        cost1 = hours1 * charge1;
        cost2 = hours2 * charge2;

        if (cost1 < cost2) { //if bidder1 cost is less than bidder2 cost
            System.out.printf("The winner is " + name1 + " with a total cost of $%4.2f ", cost1);
        } else if (cost1 > cost2) { //if bidder2 cost is less than bidder1 cost
            System.out.printf("The winner is " + name2 + " with a total cost of $%4.2f ", cost2);
        } else if ((cost1 == cost2) && hours1 < hours2) { //if both bidder costs are equal, but bidder 1 has less hours
            System.out.printf("The winner is " + name1 + " with a total cost of $%4.2f and " + hours1 + "hours", cost1);
        } else if ((cost1 == cost2) && hours1 > hours2) { //if both bidder costs are equal, but bidder 2 has less hours
            System.out.printf("The winner is " + name2 + " with a total cost of $%4.2f and " + hours2 + "hours", cost2);
        } else if ((cost1 == cost2) && (hours1 == hours2)) {

            int ratePerHourAsInt = (int) charge1;
            int costPerHourAsInt = (int) cost1;
            System.out.println("The bids of both " + name1 + " and " + name2 + " are identical.\n");
            System.out.println("Bid:\nNumber of hours: " + hours1 + "\nCost (per hour): $" + ratePerHourAsInt);
            System.out.println("Cost (total): $" + costPerHourAsInt);
            System.out.printf("Cost (per hour): $%4.2f \nCost (total): $%4.2f \n", charge1, cost1);
        }//end elseif

    }//end main
}//end class
