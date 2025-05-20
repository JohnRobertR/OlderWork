/*
 * John Robert R.
 */
public class GroceryItem
{
    private String name;
    private double value;
    public GroceryItem()
    {
        name = "none";
        value = 0.0;
    }
    public GroceryItem(String n, double v)
    {
        setName(n);
        setValue(v);
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String n) 
    {
        if(n == null)
        {
            name = "none";
        } 
        else
        {
            name = n;
        }
    }
    public double getValue() 
    {
        return value;
    }
    //Has values as less than 0
    public void setValue(double v) 
    {
        if (v < 0)
        {
            value = 0.0;
        }
        else
        {
            value = v;
        }
    }
    //Idk why this doesn't override
    public boolean equals(GroceryItem gI) 
    {
        return gI.getName().equalsIgnoreCase(this.getName()) && gI.getValue() == this.getValue() ;
    }
    @Override
    public String toString() 
    {
        return "Grocery Item Name: " + this.getName() + " Value: " + this.getValue();
    }
}