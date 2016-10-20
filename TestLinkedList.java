

import java.util.*;
public class TestLinkedList
{
   public static void main(String[] args)
    {
        LinkedList<Integer> il = new LinkedList<>(); // il = <> = null
        il.add(5);                                   // il points to 5 then null
        il.add(19);                                  // il points to 5 then 19 then null
        il.add(26);
        il.add(1,35);
        System.out.println(il);
        System.out.println(il.remove());
        System.out.println(il);
        
    }

}


