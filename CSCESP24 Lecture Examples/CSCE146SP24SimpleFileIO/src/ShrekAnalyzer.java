/*
 * John Robert R.
 */
import java.util.Scanner;
import java.io.*;
public class ShrekAnalyzer {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Shrek Analyzer." + "\nEnter a word and I'll count the amount.");
        String word = keyboard.nextLine();
        int count = lookForWord(word);
        System.out.println("The word " + word + " appears " + count + " times.");
    }
    public static int lookForWord(String aWord)
    {
        if (aWord == null)
        {
            return 0;
        }
        int words = 0;
        try
        {
            Scanner fileScanner = new Scanner(new File("./Shrek.txt"));
            while (fileScanner.hasNext())
            {
                String next = fileScanner.next();
                if (next.contains(aWord))
                {
                    
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return words;
    } 
}
