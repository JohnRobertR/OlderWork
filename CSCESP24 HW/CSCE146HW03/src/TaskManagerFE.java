/*
 * John Robert R.
 */
import java.util.*;
import java.io.*;
public class TaskManagerFE {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to the Task Organizer!");
        TaskManager test = new TaskManager();
        Scanner kb = new Scanner(System.in);
        boolean go = true;
        while (go)
        {
            System.out.println("Enter 1 to add a task");
            System.out.println("Enter 2 to delete a task");
            System.out.println("Enter 3 to print all tasks to console");
            System.out.println("Enter 4 to read from a task file");
            System.out.println("Enter 5 to write to a task file");
            System.out.println("Enter 9 to quit the program");
            int act = kb.nextInt();
            //Got the switch case to work
            switch(act)
            {
                case(1):
                {
                    System.out.println("Enter the priority");
                    int prio = kb.nextInt();
                    System.out.println("Enter the action");
                    String action = kb.next();
                    test.addTask(prio, action);
                    break;
                }
                case(2):
                {
                    System.out.println("Enter the priority you want to remove");
                    int prio = kb.nextInt();
                    System.out.println("Enter the action you want to remove");
                    String action = kb.next();
                    test.removeTask(prio, action);
                    break;
                }
                case(3):
                {
                    test.printToConsole();
                    break;
                }
                case(4):
                {
                    System.out.println("Enter task file name");
                    String file = kb.next();
                    test.readTaskFile(file);
                    break;
                }
                case(5):
                {
                    System.out.println("Enter new task file name");
                    String file = kb.next();
                    test.readToTaskFile(file);
                    break;
                }
                case(9):
                {
                    go = false;
                    break;
                }
            }
        }
    }
}
