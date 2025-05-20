/*
 * John Robert R.
 */
public class Prize 
{
    private String name;
    private int price;
    public Prize(String n, int p)
    {
        setPrice(p);
        setName(n);
    }
    public int getPrice()
    {
        return this.price;
    }
    public String getName()
    {
        return this.name;
    }
    public void setPrice(int nP)
    {
        if (nP <= 0)
        {

        }
        else
        {
            price = nP;
        }
    }
    public void setName(String nN)
    {
        if (nN == null)
        {

        }
        else
        {
            name = nN;
        }
    }
    //Helps with seeing if the prizes repeat in the random prize generation
    public boolean equals(Prize aP)
    {
        return this.name.equals(aP.name) && this.price == aP.price;
    }
}
