/*
    John Robert R.
 */ 
public class GenLL <T>
{
    private class ListNode
    {
        T data;
        ListNode link;
        public ListNode(T d, ListNode l)
        {
            data = d;
            link = l;
        }
    }
    private ListNode head;
    private ListNode current;
    private ListNode previous;
    private int size;
    public GenLL()
    {
        head = current = previous = null;
        this.size = 0;
    }
    public void add(T aD)
    {
        ListNode newNode = new ListNode(aD, null);
        if (head == null)
        {
            head = current = newNode;
            this.size = 1;
            return;
        }
        ListNode temp = head;
        while (temp.link != null)
        {
            temp = temp.link;
        }
        temp.link = newNode;
        this.size++;
    }
    public void print()
    {
        ListNode temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
    public T addAfterCurrent(T aD)
    {
        if (current == null)
        {
            return null;
        }
        return current.data;
    }
    public T getCurrent()
    {
        if (current == null)
        {
            return null;
        }
        return current.data;
    }
    public void setCurrent(T aD)
    {
        if (aD == null || current == null)
        {
            return;
        }
        current.data = aD;
    }
    public void goToNext()
    {
        if (current == null)
        {
            return;
        }
        previous = current;
        current = current.link;
    }
    public void reset()
    {
        current = head;
        previous = null;
    }
    public boolean hasMore()
    {
        return current != null;
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
        if (this.size > 0)
        {
            size--;
        }
    }
    public int getSize()
    {
        return this.size;
    }
    public T getAt(int index)
    {
        if (index < 0 || index >= size)
        {
            return null;
        }
        ListNode temp = head;
        for (int i = 0; i < index; i++)
        {
            temp = temp.link;
        }
        return temp.data;
    }
    public void setAt(int index, T aD)
    {
        if(index < 0 || index >= size || aD == null)
        {
            return;
        }
        ListNode temp = head;
        for (int i = 0; i < index; i++)
        {
            temp = temp.link;
        }
        temp.data = aD;
    }
}