/*
 * John Robert R.
 */
import java.util.*;
public class PrizeMakerFE {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Welcome to The Price Is Right!");
        boolean go = true;
        Scanner kb = new Scanner(System.in);
        PrizeMaker tester = new PrizeMaker("prizeList.txt");
        while (go)
        {
            System.out.println("Your prizes are: ");
            Prize[] displayPrize = tester.randomPrizes();
            for (int i = 0; i < displayPrize.length; i++)
            {
                System.out.println(displayPrize[i].getName());
            }
            System.out.println("You must guess the total cost of the prizes without going over and within $1,300 of its actual price");
            System.out.println("Enter your guess");
            int guess = kb.nextInt(), truth = tester.getPriceTotal(displayPrize);
            System.out.println("The real total was " + truth);
            if (guess > truth)
            {
                System.out.println("Your guess was over, you lose.");
            }
            else if (guess <= truth - 1300)
            {
                System.out.println("Your guess was close, but not close enough to win. You lose.");
            }
            else
            {
                System.out.println("You got it!");
            }
            System.out.println("Would you like to quit? Say 'yes' to quit");
            String cont = kb.next();
            if (cont.equalsIgnoreCase("yes"))
            {
                go = false;
            }
        }
    }
}
