package java8part;

import java.util.HashSet;

public class SetProCo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet<Integer> value=new HashSet<Integer>();
     System.out.println(value.hashCode());
     value.add(1);
     //System.out.println(value.hashCode());
     value.add(4);
    // System.out.println(value.hashCode());
     value.add(3);
     value.add(5);
     //value.add(1);
     System.out.println(value.hashCode());
     System.out.println("Elements in hashset"+value);
     System.out.println("size of the hashset is::"+value.size());
     System.out.println("check 5 is present or not---->"+value.contains(5));
     value.remove(1);
     System.out.println("After remove Elements in index1---->"+value);
     System.out.println(value.hashCode());
     HashSet<String> value1=new HashSet<String>();
     value1.add("Tanuja");
     System.out.println(value1.hashCode());

     value1.add("Vanuja");
     System.out.println("---->"+value1.hashCode());

	}

}
