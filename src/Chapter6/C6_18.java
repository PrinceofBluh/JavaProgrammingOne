package Chapter6;

import java.util.Scanner;

/**
 * Program that simulates password protection software by checking user input
 * for specific requirements
 *
 * @author Douglas McDaniel (dm0928293)
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        String password;
        int digitCount = 0;
        char[] passArray;
        boolean isLengthTrue = false, isLetAndDig = false, isTwoDig = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password with at least 8 characters, has only letters and at least two digits");
        password = input.nextLine();
        passArray = password.toCharArray();

        if (password.length() >= 8) {
            isLengthTrue = true;
        }

        for (int x = 0; x < passArray.length; x++) {
            if ((Character.isDigit(passArray[x]) == false) && (Character.isLetter(passArray[x]) == false)) {
                isLetAndDig = false;
                break;
            } else {
                isLetAndDig = true;
            }

            if (Character.isDigit(passArray[x])) {
                digitCount++;
            }

        }

        if (digitCount >= 2) {
            isTwoDig = true;
        }

        if (isLengthTrue == false || isLetAndDig == false || isTwoDig == false) {
            System.out.println("Invalid Password\n" + isLengthTrue + isLetAndDig + isTwoDig);
        } else {
            System.out.println("Valid Password");
        }
    }

}
