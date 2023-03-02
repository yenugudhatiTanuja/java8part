package java8part;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueProColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PriorityQueue<Integer> value=new PriorityQueue<>();
    value.offer(1);
    value.offer(2);
    value.offer(5);
    value.offer(4);
    System.out.println("elements in Queue-->"+value);
    value.poll();
    Iterator<Integer> it=value.iterator();
    while(it.hasNext())
    {
    	System.out.print(it.next());
    	System.out.print(",");
    }
   
    System.out.println("\ncheck queues is empty or not"+value.isEmpty());
    System.out.println("using peek--->"+value.peek());
    value.offer(7);
    System.out.println("elements in Queue-->"+value);
    
	}
}
