package java8part;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DeququeExamPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Deque<String> value=new ArrayDeque<>();
     value.offer("Orange");
     //value.addLast("Banana");
     value.offer("Grape");
     value.offer("Citrus");
    // value.offerLast("Banana");
     value.offer("Mango");
     value.addFirst("Apple");
     value.offerLast("Noodles");
     value.add("TV");
     System.out.println("Elements in deque---->"+value);
     System.out.println("size of the queue---->"+value.size());
     System.out.println("Peek shows the top element---->"+value.peek());
     System.out.println("PeekFirst shows the first element--->"+value.peekFirst());
     System.out.println("PeekFirst shows the Last element--->"+value.peekLast());
     System.out.println("Check orange status using contains()---->"+value.contains("orange"));
     System.out.println("Check cherry status using contains()---->"+value.contains("cherry"));
     System.out.println("Elements in deque---->"+value);
     value.poll();
     System.out.println("After poll Elements in deque---->"+value);
     value.pollFirst();
     System.out.println("After pollFirst Elements in deque---->"+value);
     value.pollLast();
     System.out.println("After pollLast Elements in deque---->"+value);
     System.out.println("size of the queue---->"+value.size());
     System.out.println("getFirst() it returns the first element---->"+value.getFirst());
     System.out.println("getLast() it returns the last element---->"+value.getLast());



	}

}
