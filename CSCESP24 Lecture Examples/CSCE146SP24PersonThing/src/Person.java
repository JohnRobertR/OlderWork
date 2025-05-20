public class Person {
    private String name;
    public Person()
    {
        name = "none";
    }
    public Person(String n)
    {
        setName(n);
    }
    public String getName()
    {
        return name;
    }
    public void setName(String nName)
    {
        if (nName == null)
        {
            name = "none";
        }
        else
        {
            name = nName;
        }
    }
    public String toString()
    {
        return "Name: " + name;
    }
    public boolean equals(Person aP)
    {
        return aP != null && this.name.equals(aP.getName());
    }
}
