package java8part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinklistProg {
	

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Integer> li= new LinkedList<>();
       li.add(1);
       li.add(2);
       li.add(3);
       li.add(1, 4);
       li.add(77);
       li.add(55);
       li.add(14);
       System.out.println("sizze:-------->"+li.size());
       System.out.println("linked list elements---->"+li);
       li.remove(1);//it remove the index values
       System.out.println("After removing the index 1----->"+li);
       li.set(2, 9);//It set values at position
       System.out.println("It sets the value 9 at index 2----->"+li);
       int b=li.get(2); //It gives the  element at index at 2
       System.out.println("It prints the elements at index 2---->"+b);
       li.removeFirst(); // it removes first elements
       System.out.println("After removing first element---->"+li);
       li.addFirst(6);//it add element at index '0'
       System.out.println("After adds value at first position---->"+li);
       li.addLast(5); // It add value at last position
       System.out.println("After adds value at last position---->"+li);
       li.removeLast(); //It removes the last element
       System.out.println("After removing last element--->"+li);
       System.out.println(li.element());
       int c=li.getFirst();
       System.out.println("It prints the first elements---->"+c);
       int x=li.getLast();
       System.out.println("It prints the element at last position----->"+x);
       //li.peek();//It prints the all elements in the list
       System.out.println("using peek prints elements--->"+li.peek());
       System.out.println("peekFirst same as getFirst()--->"+li.peekFirst());
       System.out.println("peekLast same as getLast()--->"+li.peekLast());
       System.out.println("before poll elements in linked list:::"+li);
       li.poll();
       System.out.println("After poll elements in linked list:::"+li);
       li.pollFirst();
       System.out.println(" after PollFirst  elements in linked list--->"+li);
       li.pollLast();
       System.out.println("After pollLast elements in linked list"+li);
       li.pop();//it removes the first element
      // System.out.println(li);
       System.out.println("Afetr pop--->" +li);
      // System.out.println(li);
       li.push(100);
       li.push(50);
       System.out.println("After push---->"+li);
       
      // System.out.println(li);
       //LinkedList<Integer> obj=new LinkedList<>();
       Collection collection=new ArrayList<>();
       collection.add(99);
       collection.add(98);
       li.addAll(collection);
       System.out.println("after add collection----->"+li);
       System.out.println("after add collection----->"+li.contains(99));
       System.out.println("after add collection----->"+li.contains(56));
       LinkedList<Integer> li1=new LinkedList<>();
       li1 =(LinkedList)li.clone();
       System.out.println("clone using another list----->"+li1);
       System.out.println("get index of 100 using indexOf method--->"+li1.indexOf(100));
       li1.add(100);
       System.out.println(" elements in li1 ----->"+li1);
       System.out.println("get index of 100 using indexOf method--->"+li1.indexOf(100));
       //li1.lastIndexOf(100);
       System.out.println("get index of 100 using indexOf method--->"+li1.lastIndexOf(100));
      // System.out.println("get index of 100 using indexOf method--->"+li1.indexOf(55));
      // System.out.println("get index of 100 using indexOf method--->"+li1.lastIndexOf(55));
      //li1.replaceAll(8);
       //li1.sort(null);
       Collections.sort(li1);
       System.out.println(" elements sort ----->"+li1);

	}

}
