package Chapter6;

import java.util.Scanner;

/**
 * Program that takes a specific dollar amount (given via user input) and
 * converts it to a currency of the users choice
 *
 * @author Douglas McDaniel (dm0928293)
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //add in the percentage reductions
        double euroDollar;
        double poundDollar;
        double yenDollar;
        double dollarAmount;
        boolean switchLoop = false;
        boolean regLoop = false;
        boolean moreLoops = false;
        String x;
        Scanner input = new Scanner(System.in);

        System.out.println("How many Euros does a dollar buy? ");
        euroDollar = input.nextDouble();
        System.out.println("How many Pound Sterling does a dollar buy? ");
        poundDollar = input.nextDouble();
        System.out.println("How many Yen does a dollar buy? ");
        yenDollar = input.nextDouble();

        do {//loop here
            System.out.println("Please enter the number of dollars you want to convert");
            dollarAmount = input.nextDouble();
            input.nextLine(); //consumes the extra \n

            do {//switch loop here
                System.out.println("[E] Euro\n[P] Pounds\n[Y] Yen ");
                x = input.nextLine();

                switch (x) {
                    case "E":
                    case "e":
                        System.out.println(Currency(dollarAmount, euroDollar) + " Euro");
                        switchLoop = false;
                        break;
                    case "P":
                    case "p":
                        System.out.println(Currency(dollarAmount, poundDollar) + " Pound Sterling");
                        switchLoop = false;
                        break;
                    case "Y":
                    case "y":
                        System.out.println(Currency(dollarAmount, yenDollar) + " Yen");
                        switchLoop = false;
                        break;
                    default:
                        switchLoop = true;
                        break;

                }
            } while (switchLoop);

            do {
                System.out.println("Are there more conversions to perform? [Y] or [N]");

                x = input.nextLine();
                if (x.equals("Y") || x.equals("y")) {
                    regLoop = true;
                    moreLoops = false;
                } else if (x.equals("N") || x.equals("n")) {
                    regLoop = false;
                    moreLoops = false;
                } else {
                    moreLoops = true;
                }
            } while (moreLoops == true);
        } while (regLoop == true);
    }

    /**
     * Currency Method
     *
     * @param dol double "dollar" takes the dollar amount to convert via
     * exchange
     * @param exhange double exchange takes the exchange rate (used to multiply
     * with the currency to find the new currency amount)
     * @return returns String "output" to tell the user what occurred during the
     * exchange
     */
    public static String Currency(double dol, double exhange) {

        String output;
        double reduction;

        if (dol > 100) {
            reduction = .05 * dol;//5%
        } else {
            reduction = .10 * dol;//10%
        }
        double newCurrency = dol - reduction;
        newCurrency = newCurrency * exhange;

        output = String.format("For " + dol + " dollars, you will be able to buy %.2f", newCurrency);

        return output;
    }
}
