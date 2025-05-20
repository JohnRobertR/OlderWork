/*
 * John Robert R.
 */
import java.util.*;
public class GameListFE {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Videogame Database!");
        boolean go = true;
        Scanner kb = new Scanner(System.in);
        GenLL<Game> results = new GenLL<>();
        GameList test = new GameList();
        while (go)
        {
            System.out.println("Enter 1 to load database from file");
            System.out.println("Enter 2 to search your database");
            System.out.println("Enter 3 to print results");
            System.out.println("Enter 4 to print results to a file");
            System.out.println("Enter 9 to quit");
            //Doesn't require switch case to be placed into a variable before it goes into the switch case
            switch(kb.nextInt())
            {
                case 1:
                {
                    System.out.println("Enter name of file used for collection");
                    test.setUpDatabase(kb.next());
                    break;
                }
                case 2:
                {
                    System.out.println("Enter game name or '*' for all");
                    String gameCon = kb.next();
                    System.out.println("Enter console name or '*' for all");
                    String consoleCon = kb.next();
                    results = test.getFromDatabase(gameCon, consoleCon);
                    while (results.hasMore())
                    {
                        Game curr = results.getCurrent();
                        System.out.println(curr.getName() + " " + curr.getConsole());
                        results.goToNext();
                    }
                    results.reset();
                    break;
                }
                case 3:
                {
                    while (results.hasMore())
                    {
                        Game curr = results.getCurrent();
                        System.out.println(curr.getName() + " " + curr.getConsole());
                        results.goToNext();
                    }
                    results.reset();
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the name of the file you want to print results to");
                    String fN = kb.next();
                    System.out.println("Do you want to append to this file? Enter 'true' for yes and 'false' for no");
                    boolean app = kb.nextBoolean();
                    test.printToFile(results, fN, app);
                    break;
                }
                case 9:
                {
                    go = false;
                    break;
                }
            }
        }
    }
}
