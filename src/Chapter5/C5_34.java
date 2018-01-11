package Chapter5;

import java.util.Scanner;
import java.util.Random;

/**
 * Program to simulate a rock/paper/scissors game via while loops and switch
 * statements
 *
 * @author Douglas McDaniel (dm0928293)
 */
public class C5_34 {

    /**
     *Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int comWins = 0, pWins = 0;
        Scanner input = new Scanner(System.in);
        String choice;
        Random rand = new Random();

        while (!((comWins - pWins) == 2 || (pWins - comWins) == 2)) {

            int n = rand.nextInt(3) + 1; //1 = rock, 2 = paper, 3 = scissors    

            System.out.println("Make a choice using the corresponding letter:\n[R] Rock\n[P] Paper \n[S] Scissors");
            choice = input.next();

            switch (choice) {
                case "R":
                    if (n == 1) {
                        System.out.println("It's a tie!");
                    } else if (n == 2) {
                        System.out.println("Computer Wins!");
                        comWins++;
                    } else {
                        System.out.println("You Win!");
                        pWins++;
                    }
                    break;
                case "P":
                    if (n == 1) {
                        System.out.println("You Win!");
                        pWins++;
                    } else if (n == 2) {
                        System.out.println("It's a tie!");

                    } else {
                        System.out.println("Computer Wins!");
                        comWins++;
                    }
                    break;
                case "S":
                    if (n == 1) {
                        System.out.println("Computer Wins!");
                        comWins++;
                    } else if (n == 2) {
                        System.out.println("You Win!");
                        pWins++;
                    } else {
                        System.out.println("It's a tie!");

                    }
                    break;
                default:
                    System.out.println("Please enter a valid letter");
            }
            System.out.println("Player: " + pWins + "   Computer: " + comWins);
        }
    }

}
