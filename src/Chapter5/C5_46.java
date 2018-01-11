package Chapter5;

import java.util.Scanner;

/**
 * Program that reverses a string given via user input
 *
 * @author Douglas McDaniel (dm0928293)
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String message;
        char[] messageChars;

        System.out.println("Enter a phrase and i'll print it backwards:");
        message = input.nextLine();

        messageChars = message.toCharArray();
        char[] reverse = new char[messageChars.length];

        for (int x = 0; x < messageChars.length; x++) {
            reverse[x] = messageChars[(messageChars.length - 1) - x]; // N I C E  length = 4
            // 0 1 2 3
        }
        System.out.println(reverse);
    }

}
