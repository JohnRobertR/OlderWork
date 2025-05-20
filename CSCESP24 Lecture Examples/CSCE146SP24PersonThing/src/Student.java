public class Student extends Person {
    private int id;
    public Student()
    {
        super();
        id = 0;
    }
    public Student(String n, int i)
    {
        super(n);
        setID(i);
    }
    public int getID()
    {
        return id;
    }
    public void setID(int nI)
    {
        if (nI < 0)
        {
            id = 0;
        }
        else
        {
            id = nI;
        }
    }
    public String toString()
    {
        return super.toString() + " ID: " + id;
    }
    public boolean equals(Student aS)
    {
        return aS != null && super.equals(aS) && this.id == aS.getID();
    }
}
