/*
 * John Robert R.
 */
import java.io.*;
import java.util.*;
public class FileIOSolutions {
    public static void pastTense(String fileStart, String outFileName)
    {
        //Had to use try/catch because I couldn't edit driver file
        try
        {
            Scanner fileIn = new Scanner(new File(fileStart));
            PrintWriter writeIn = new PrintWriter(new FileOutputStream(outFileName));
            //Create new file
            while(fileIn.hasNext())
            {
                String next = fileIn.next();
                if (next.equalsIgnoreCase("is"))
                {
                    //Trying to differentiate when the uppercase is needed or not
                    if (next.equals("Is" + " "))
                    {
                        writeIn.print("Was");
                    }
                    else
                    {
                        writeIn.print("was" + " ");
                    }
                }
                else
                {
                    writeIn.print(next + " ");
                }
            }
            writeIn.close();
            //Print out file
            Scanner fileOut = new Scanner(new File(outFileName));
            while (fileOut.hasNext())
            {
                System.out.println(fileOut.next());
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static double totalTubeVolume(String tubes)
    {
        double tubeTotals = 0.0;
        try
        {
            Scanner tubular = new Scanner(new File(tubes));
            while(tubular.hasNext())
            {
                String newTube = tubular.nextLine();
                String[] tube = newTube.split("\t");
                //Convoluted way of getting all of the math pieces onto one line
                tubeTotals += Math.pow(Double.parseDouble(tube[1]), 2) * Math.PI * Double.parseDouble(tube[2]); 
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return tubeTotals;
    }
}
