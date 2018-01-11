package Chapter2;
import java.util.Scanner;
/**
 * Program to showcase storing user input into variables
 *
 * @author Douglas McDaniel (dm0928293)
 */

public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        double radius, length, area, volume;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a cylinder: ");
        radius = input.nextDouble(); //user input
        System.out.println("Enter the length of a cylinder: ");
        length = input.nextDouble(); //user input
        area = radius * radius * 3.14;
        volume = area * length; //(radius * radius * 3.14) * length
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }

}
