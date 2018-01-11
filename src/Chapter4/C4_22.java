package Chapter4;

import java.util.Scanner;

/**
 * Program to determine whether a string is a substring of another
 *
 * @author Douglas McDaniel (dm0928293)
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s1, s2;

        System.out.println("Enter String One");
        s1 = input.nextLine(); //user input
        System.out.println("Enter String Two");
        s2 = input.nextLine(); //user input

        if (s1.contains(s2)) //if the second string is also inside of the first string
        {
            System.out.println(s2 + " is a substring of " + s1);
        } else //if the second string is not a part of the first string
        {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    } //end main

}//end class
