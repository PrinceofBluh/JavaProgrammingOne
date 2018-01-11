package Chapter3;

import java.util.Scanner;

/**
 * Program to see if a user has input a number that is divisible by 5 and 6
 *
 * @author Douglas McDaniel (dm0928293)
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String phrase1, phrase2, phrase3;

        System.out.println("Enter an integer to see if it is divisible by 5 and 6: ");
        int num = input.nextInt();

        if (((num % 5) == 0) && (num % 6) == 0) { //if user input is divisible by both 5 and 6
            phrase1 = "true"; //outputs true for the first println statement
        } else {
            phrase1 = "false";//outputs false for the first println statement
        }
        if ((num % 5) == 0 || (num % 6) == 0) {//if user input is divisible by either 5 or 6
            phrase2 = "true";//outputs true for the second println statement
        } else {
            phrase2 = "false";//outputs false for the second println statement
        }
        if ((num % 5) == 0 ^ (num % 6) == 0) {//if user input is divisible by either 5 or 6 but not both
            phrase3 = "true";//outputs true for the third println statement
        } else {
            phrase3 = "false";//outputs false for the third println statement
        }

        //output
        System.out.println("Is your number divisible by 5 & 6? " + phrase1);
        System.out.println("Is your number divisible by 5 or 6? " + phrase2);
        System.out.println("Is your number divisible by 5 or 6, but not both? " + phrase3);
    }
}
