package Chapter4;

import java.util.Scanner;

/**
 * Program to output a specific statement given user input using if/else and
 * switch statements
 *
 * @author Douglas McDaniel (dm0928293)
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        char n1, n2;
        String user, message1, message2 = null; //message2 gives error if not null
        Scanner input = new Scanner(System.in); //scanner created

        System.out.println("Enter two characters: ");
        user = input.nextLine();
        if (user.length() > 2 || user.length() < 2) {
            message1 = "Invalid";
            message2 = "input";
        } else {
            n1 = user.charAt(0);
            n2 = user.charAt(1);

            switch (n1) { //checking the first character
                case 'M':
                    message1 = "Mathematics";
                    break;
                case 'C':
                    message1 = "Computer Science";
                    break;
                case 'I':
                    message1 = "Information Technology";
                    break;
                default:
                    message1 = "Invalid";
                    message2 = "input";
                    break;

            } //end n1 switch
            if (!(message1.equals("Invalid"))) {
                switch (n2) { //checking the second character
                    case '1':
                        message2 = "Freshman";
                        break;
                    case '2':
                        message2 = "Sophomore";
                        break;
                    case '3':
                        message2 = "Junior";
                        break;
                    case '4':
                        message2 = "Senior";
                        break;
                    default:
                        message1 = "Invalid";
                        message2 = "input";
                        break;
                } //end n2 switch
            } //end n2 if statement           
        }  //end else
        System.out.println(message1 + " " + message2);
    } //end main

} //end class
