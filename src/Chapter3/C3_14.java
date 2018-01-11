package Chapter3;
import java.util.Scanner;
/**
 * Program to utilize if/else statements to simulate a coinflip contest
 *
 * @author Douglas McDaniel (dm0928293)
 */

public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //scanner created
        String answer; //User input to be stored as answer
        double coin = Math.random(); //creates any number between 0 and 1

        if (coin < .5) {
            coin = 0;  //heads           //util.Random(1) + 0 will always be 0
        } else {
            coin = 1;   //tails
        }
        System.out.println("A coin was flipped! Type 'h' for heads or 't' for tails: ");
        answer = input.next(); //stores the user input

        if (answer.equals("h") && coin == 0) { //if the user guesses heads and the coin is heads
            System.out.println("Correct!");
        } else if (answer.equals("h") && coin == 1) { //if the user guesses heads and the coin is tails
            System.out.println("Wrong :(");
        } else if (answer.equals("t") && coin == 0) { //the user guesses tails and the coin is heads
            System.out.println("Wrong :(");
        } else if (answer.equals("t") && coin == 1) { //the user guesses tails and the coin is tails
            System.out.println("Correct! :D");
        } else {
            System.out.println("Please enter either 'h' or 't' "); //if the user doesnt enter h or t
        }
    }
}
