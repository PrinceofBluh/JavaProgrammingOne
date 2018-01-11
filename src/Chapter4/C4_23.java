package Chapter4;
import java.util.Scanner;
/**
 * Program to create a payroll using user input, then formatting using the
 * printf function
 *
 * @author Douglas McDaniel (dm0928293)
 */

public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int hours;
        double payRate, fedRate, stateRate, gross;

        System.out.println("Enter employee's name: ");
        name = input.next(); //user input
        System.out.println("Enter number of hours worked in a week (whole number): ");
        hours = input.nextInt(); //user input
        System.out.println("Enter hourly pay rate: ");
        payRate = input.nextDouble(); //user input
        System.out.println("Enter federal tax withholding rate: ");
        fedRate = input.nextDouble(); //user input
        System.out.println("Enter state tax withholding rate: ");
        stateRate = input.nextDouble(); //user input

        gross = payRate * hours;  //gross calculated 

        //payroll output start
        System.out.println("\n----------\nEmployee Name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.printf("Pay Rate: $%4.2f \n", payRate); //format payRate as a currency
        System.out.printf("Gross Pay: $%4.2f\n", gross); //format gross as a currency
        System.out.println("Deductions:");

        System.out.printf("\tFederal Withholding (" + (fedRate * 100) + "%%): $%4.2f \n", fedRate * gross); //format the fedRate*gross into a currency
        System.out.printf("\tState Withholding (" + (stateRate * 100) + "%%): $%4.2f \n", stateRate * gross);//format the stateRate*gross into a currency
        System.out.printf("\tTotal Deduction: $%4.2f", (fedRate * gross) + (stateRate * gross));

        System.out.printf("\nNet Pay: $%4.2f \n", gross - ((fedRate * gross) + (stateRate * gross)));
    } //end main

} //end class
