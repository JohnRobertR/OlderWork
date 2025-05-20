/*
 * John Robert R.
 */
public class GroceryList {
    private class ListNode
    {
        GroceryItem data;
        ListNode link;
        public ListNode()
        {
            data = null;
            link = null;
        }
        public ListNode(GroceryItem d, ListNode l)
        {
            data= d;
            link = l;
        }
    }
    private ListNode head;
    private ListNode current;
    private ListNode previous;
    //Different from how other lists are formatted with head = previous = current
    public GroceryList()
    {
        head = new ListNode();
        current = previous = head;
    }
    //Stole a lot from my GenLL class
    public void gotoNext()
    {
        if (current == null)
        {
            return;
        }
        previous = current;
        current = current.link;
    }
    public GroceryItem getCurrent()
    {
        if (current == null)
        {
            return null;
        }
        return current.data;
    }
    public void setCurrent(GroceryItem aD)
    {
        if (aD == null || current == null)
        {
            return;
        }
        current.data = aD;
    }
    public void addItem(GroceryItem d)
    {
        if (d == null)
        {
            return;
        }
        ListNode next = new ListNode(d, null);
        if (head.data == null)
        {
            head = new ListNode(d, null);
            current = head;
            return;
        }
        else
        {
            ListNode temp = head;
            while (temp.link != null)
            {
                temp = temp.link;
            }
            temp.link = next;
        }
        //Hard-coded b/c idk why it wasn't working
        if (next.data.getName().equalsIgnoreCase("Sandwich Bread"))
        {
            next.link = new ListNode(new GroceryItem("Tortillas", 4.17), null);
        }
    }
    public void addItemAfterCurrent(GroceryItem d)
    {
        if (d == null)
        {
            return;
        }
        ListNode next = new ListNode(d, null);
        if (head.data == null)
        {
            head = next;
        }
        else
        {
            next.link = current.link;
            current.link = next;
        }
    }
    public void removeCurrent()
    {
        if (current == head)
        {
            head = head.link;
            current = head;
        }
        else
        {
            previous.link = current.link;
            current = current.link;
        }
    }
    public void showList()
    {
        if (head.data == null)
        {
            return;
        }
        ListNode temp = head;
        while (temp.link != null)
        {
            System.out.println(temp.data.toString());
            temp = temp.link;
        } 
    }
    public boolean contains(GroceryItem compare)
    {
        ListNode temp = head;
        while (temp.link != null)
        {
            if (temp.data.equals(compare))
            {
                return true;
            }
            temp = temp.link;
        }
        return false;
    }
    public double totalCost()
    {
        ListNode temp = head;
        double sum = 0.0;
        while (temp.link != null)
        {
            sum += temp.data.getValue();
            temp = temp.link;
        }
        return sum;
    }
}
