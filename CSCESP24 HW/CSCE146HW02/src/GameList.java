/*
 * John Robert R.
 */
import java.util.*;
import java.io.*;
public class GameList {
    private GenLL<Game> database;
    public GameList()
    {
        database = new GenLL<>();
    }
    //Has to be separate because of switch cases
    public void setUpDatabase(String dataFile)  throws FileNotFoundException
    {
        Scanner reader = new Scanner(new File(dataFile));
        while (reader.hasNext())
        {
            String nextGame = reader.nextLine();
            String[] game = nextGame.split("\t");
            if (game.length == 2)
            {
                Game next = new Game(game[0], game[1]);
                database.add(next);
            }
            else
            {
                continue;
            }
        }
    }
    public GenLL<Game> getFromDatabase(String gameCondition, String consoleCondition)
    {
        GenLL<Game> result = new GenLL<>();
        if (gameCondition.equals("*") && consoleCondition.equals("*"))
        {
            result = database;
            return result;
        }
        database.reset();
        while (database.hasMore())
        {
            Game test = database.getCurrent();
            //All of the options for adding games
            if (test.getName().toLowerCase().contains(gameCondition.toLowerCase()) && consoleCondition.equals("*"))
            {
                result.add(test);
            }
            else if (test.getName().toLowerCase().contains(gameCondition.toLowerCase()) && test.getConsole().toLowerCase().contains(consoleCondition.toLowerCase()))
            {
                result.add(test);
            }
            else if (gameCondition.equals("*") && test.getConsole().toLowerCase().contains(consoleCondition))
            {
                result.add(test);
            }
            database.goToNext();
            System.out.println(result.getSize());
        }
        database.reset();
        return result;
    }
    //Result of selecting option 4
    public void printToFile(GenLL<Game> results, String fileName, boolean append) throws IOException
    {
        PrintWriter write;
        write = new PrintWriter(new FileOutputStream(fileName, append));
        results.reset();
        while (results.hasMore())
        {
            Game get = results.getCurrent();
            write.println(get.getName() + "\t" + get.getConsole());
            results.goToNext();
        }
        results.reset();
        write.close();
    }
}
