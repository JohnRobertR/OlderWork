/*
 * John Robert R.
 */
import java.util.*;
import java.io.*;
public class TaskManager
{
    private GenLL<Task>[] organizer;
    public TaskManager()
    {
        organizer = new GenLL[5];
        for (int i = 0; i < organizer.length; i++)
        {
            organizer[i] = new GenLL<Task>();
        }
    }
    //Next 2 very similar
    public void addTask(int prio, String act)
    {
        int index = 0;
        Task next = new Task(act, prio), temp = organizer[prio].getAt(index);
        
        while (temp != null)
        {
            if (temp.equals(next))
            {
                System.out.println("Task already added");
                return;
            }
            index++;
            temp = organizer[prio].getAt(index);
        }
        organizer[prio].add(next);
    }
    public void removeTask(int prio, String act)
    {
        int index = 0;
        Task next = new Task(act, prio), temp = organizer[prio].getAt(index);
        organizer[prio].reset();
        while (temp != null)
        {
            if (temp.equals(next))
            {
                while (!organizer[prio].getCurrent().equals(temp))
                {
                    organizer[prio].goToNext();
                }
                organizer[prio].removeCurrent();
                return;
            }
            temp = organizer[prio].getAt(index + 1);
        }
        organizer[prio].reset();
    }
    //Just used the GenLL's print method for this
    public void printToConsole()
    {
        for (int i = 0; i < organizer.length; i++)
        {
            organizer[i].print();
        }
    }
    public void readTaskFile(String fileName) throws FileNotFoundException
    {
        Scanner fileIn = new Scanner(new File(fileName));
        while (fileIn.hasNext())
        {
            String line = fileIn.nextLine();
            String[] splitter = line.split("\t");
            if (splitter.length != 2)
            {
                continue;
            }
            Task next = new Task(splitter[1], Integer.parseInt(splitter[0]));
            addTask(next.getPriority(), next.getAction());
        }
    }
    //Couldn't use GenLL print method because I can't send a PrintWriter to that method
    public void readToTaskFile(String newFile) throws FileNotFoundException
    {
        PrintWriter read = new PrintWriter(new FileOutputStream(newFile));
        for (int i = 0; i < organizer.length; i++)
        {
            organizer[i].reset();
            Task temp = organizer[i].getCurrent();
            while (temp != null)
            {
                read.print(temp.toString());
                organizer[i].goToNext();
                temp = organizer[i].getCurrent();
            }
        }
        read.close();
    }
}
