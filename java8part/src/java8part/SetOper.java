package java8part;

import java.util.HashSet;

public class SetOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> value=new HashSet<Integer>();
		value.add(1);
		value.add(2);
		value.add(3);
		//System.out.println(value);
		HashSet<Integer> value1=new HashSet<Integer>();
		value1.add(4);
		value1.add(2);
		value1.add(3);
		value1.add(5);
		System.out.println("set1:----->"+value);
		System.out.println("set2:------>"+value1);
		value.retainAll(value1);
		System.out.println("set1 Intersection set2:----->"+value);
		System.out.println("After Intersection set1:----->"+value);
		System.out.println("After intersection set2:------>"+value1);
		System.out.println("set1 is subset of set2 checking:---->"+value1.containsAll(value));
		System.out.println("set2 is subset of set1 checking:---->"+value.containsAll(value1));
		value.addAll(value1);
		System.out.println("set1 union set2:------->"+value);
		System.out.println("After union set1:----->"+value);
		System.out.println("After union set2:------>"+value1);
       // value1.contains(value)

	}
}
