package Chapter5;
import java.util.Scanner;
/**
 * Program to simulate a yes/no voting poll via switch statements and while loops
 *
 * @author Douglas McDaniel (dm0928293)
 */
public class P5 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        
        int yVote = 0, nVote = 0;
        String vote;
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        
        while(loop == true){
            
            System.out.println("[Y] Vote Yes\n[N] Vote No\n[Q] Quit Voting");
            vote = input.nextLine();
            
            switch(vote){
                 case "Y":
                 case "y":
                    ++yVote;
                    break;
                 case "N":
                 case "n":
                    nVote++;
                    break;
                 case "Q":
                 case "q":
                    loop = false;
                    break;
                 default:
                     System.out.println("INVALID CODE");
                     break;
            }
            
        }
        System.out.println("Yes votes: " + yVote);
        System.out.println("No votes: " + nVote);
    }
}
