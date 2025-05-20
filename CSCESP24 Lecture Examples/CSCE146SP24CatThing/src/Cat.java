/*
 * John Robert R.
 */
//Step 1: Define the class
public class Cat 
{
    //Step 2: Create instance variables/class constants
    private String name;
    private double weight;
    private int numOfLegs;
    //Step 3: Create constructors
    public Cat()//Default
    {
        name = "none";
        weight = 1.0;
        numOfLegs = 4;
    }
    public Cat(String n, double w, int l)//Parameter
    {
        setName(n);
        setWeight(w);
        setNumOfLegs(l);
    }
    //Step 4: Accessors
    public String getName()
    {
        return this.name;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public int getNumOfLegs()
    {
        return this.numOfLegs;
    }
    //Step 5: Mutators
    public void setName(String nName)
    {
        if (nName != null)
        {
            this.name = nName;
        }
        else
        {
            this.name = "none";
        }
    }
    public void setWeight(double nWeight)
    {
        if (nWeight > 0.0)
        {
            this.weight = nWeight;
        }
        else
        {
            this.weight = 1.0;
        }
    }
    public void setNumOfLegs(int nLegs)
    {
        if (nLegs >= 0 && nLegs <= 4)
        {
            this.numOfLegs = nLegs;
        }
        else
        {
            this.numOfLegs = 4;
        }
    }
    //Step 6: Other useful methods
    public String toString()
    {
        return "Name: " + this.name + " Weight: " + this.weight + " Number of legs: " + this.numOfLegs;
    }
    public boolean equals(Cat other)
    {
        return other != null && this.name.equals(other.getName()) && this.weight == other.getWeight() && this.numOfLegs == other.getNumOfLegs();
    }
}
