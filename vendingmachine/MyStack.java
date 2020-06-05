package vendingmachine;

import java.util.ArrayList;


public class MyStack {
 ArrayList stack = new ArrayList();
    
    public void push(String element)
    {
       stack.add(element);
    }
    
    public String pop()
    {
        String temp = (String) stack.get(getSize()-1);
        stack.remove(getSize()-1);
        return temp;
        
    }
    
    public String peek()
    {
        return (String) stack.get(getSize()-1);
    }
    
    public int getSize()
    {
        return stack.size();
    }

    public boolean isEmpty()
    {
        return getSize() <=0;
    }

}
