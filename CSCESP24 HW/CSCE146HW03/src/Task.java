/*
 * John Robert R.
 */
public class Task
{
    private String action;
    private int priority;
    public Task(String a, int p)
    {
        setAction(a);
        setPriority(p);
    }
    public String getAction() 
    {
        return action;
    }
    public void setAction(String a) 
    {
        if (a.equals(null))
        {
            return;
        }
        else
        {
            this.action = a;
        }
    }
    public int getPriority() 
    {
        return priority;
    }
    public void setPriority(int p) 
    {
        if (p < 0 || p >= 5)
        {
            return;
        }
        else
        {
            this.priority = p;
        }
    }
    public boolean equals(Task aT)
    {
        return aT.priority == this.priority && aT.action.equalsIgnoreCase(this.action);
    }
    public String toString()
    {
        return "Task Priority: " + this.priority + " Task Action: " + this.action;
    }
}