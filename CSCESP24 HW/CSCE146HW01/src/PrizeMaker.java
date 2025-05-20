/*
 * John Robert R.
 */
import java.util.*;
import java.io.*;
public class PrizeMaker
{
    private Prize[] listOfPrizes;
    public PrizeMaker(String list) throws FileNotFoundException
    {
        listOfPrizes = new Prize[53];
        int ind = 0;
        Scanner into = new Scanner(new File(list));
        while (into.hasNextLine())
        {
            //Make sure that the prize file is done correctly
            String line = into.nextLine();
            String[] delim = line.split("\t");
            if (delim.length != 2)
            {
                continue;
            }
            else
            {
                Prize add = new Prize(delim[0], Integer.parseInt(delim[1]));
                listOfPrizes[ind] = add;
            }
            ind++;
        }
    }
    //Sets up each new set of random prizes
    public Prize[] randomPrizes()
    {
        Random rand = new Random();
        Prize[] newPrizes = new Prize[5];
        int ind = 0, id = 0;
        boolean found = false;
        //If the last slot in the array isn't full, then still search to add more prizes
        while (newPrizes[4] == null)
        {
            id = rand.nextInt(0, 53);
            for (int i = 0; i < newPrizes.length; i++)
            {
                if (newPrizes[i] == null)
                {
                    continue;
                }
                if (newPrizes[i].equals(listOfPrizes[id]))
                {
                    found = true;
                }
            }
            if (!found)
            {
                newPrizes[ind] = listOfPrizes[id];
                ind++;
            }
        }
        return newPrizes;
    }
    //Easy way to sum prices of the random prize array
    public int getPriceTotal(Prize[] list)
    {
        int total = 0;
        for (int i = 0; i < list.length; i++)
        {
            total += list[i].getPrice();
        }
        return total;
    }
}