/*
 * John Robert R.
 */
public class Game {
    private String name;
    private String console;
    //gN = game name, cN = console name
    public Game(String gN, String cN)
    {
        setName(gN);
        setConsole(cN);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null)
        {
            name = "none";
        }
        this.name = name;
    }
    public String getConsole() {
        return console;
    }
    public void setConsole(String console) {
        if (console == null)
        {
            console = "none";
        }
        this.console = console;
    }
    
}
