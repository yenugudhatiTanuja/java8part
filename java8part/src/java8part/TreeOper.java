package java8part;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeOper {
       public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<String> value= new TreeSet<>();
        value.add("Orange");
        value.add("Banana");
        value.add("Boll");
        value.add("Apple");
        value.add("Citrus");
        value.add("A");
        value.add("B");

        System.out.println("Elements in TreeSet"+value);
        System.out.println("check orange present or not----->"+value.contains("Orange"));
        System.out.println("check ceiling  not----->"+value.ceiling("Banana"));
        System.out.println("check empty or not----->"+value.isEmpty());
        String s= value.higher("Apple");
        System.out.println("higher:----->"+s);
        String t= value.lower("Orange");
        System.out.println("lower:---->"+t);
        value.pollFirst();
        System.out.println("After Pollfirst Elements in TreeSet"+value);
        Iterator i=value.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.print(i.next());  
            System.out.print(",");
        }
        value.pollLast();
        System.out.println("\nAfter PollLast Elements in TreeSet---->"+value);
       // value.g
        
	}

}
