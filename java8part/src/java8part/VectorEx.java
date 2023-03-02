package java8part;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector<Integer> values=new Vector<>();
      System.out.println(values.size());
      values.add(1);
      values.add(4);
      values.add(1,5);
      values.add(6);
      System.out.println("after adding elements--->"+values);
      System.out.println("after add elements size is--> "+values.size());
      values.remove(1);
      System.out.println("after removing at 1 position---> "+values);
      values.set(0, 9);//it updates position 0  as 9
      //System.out.println("after set values position 0 as 9 ");
      System.out.println("after set "+values);

     /* for(int i=0;i<values.size();i++)
      {
    	  System.out.print(values.get(i));
      }*/
     // values.remove("9");
      int b=values.get(1);
      System.out.println("using get elements---->"+b);
      System.out.println("using contains check 6 is present-->"+values.contains(6));
      values.clear();
      System.out.println("after clear--->"+values);
      Vector<Integer> values1=new Vector<>();
      values1.add(55);
      values1.add(65);
      values1.add(75);
      values1.add(85);
      values.addAll(values1);
      System.out.println("after add another vector--->"+values);
      Iterator<Integer> it=values.iterator();//it iterates the individual elements 
      while(it.hasNext())//hasnext() method tells the next element present or not
      {
     
    	  System.out.print(it.next());//next() is a method it prints the next element
    	  System.out.print(",");
      }
      
	}

}
