package java8part;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExamDE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Deque<String> val=new ArrayDeque<>();
       Deque<Integer> de_que
       = new ArrayDeque<Integer>(10);

   // add() method to insert
   de_que.add(10);
   de_que.add(20);
   de_que.add(30);
   de_que.add(40);
   de_que.add(50);

   System.out.println(de_que);

   // clear() method
   //de_que.clear();

   // addFirst() method to insert the
   // elements at the head
   de_que.addFirst(264);
   de_que.addFirst(291);
   de_que.add(77);
   de_que.addLast(88);

   // addLast() method to insert the
   // elements at the tail
  // de_que.addLast(4);
   de_que.add(14);

   System.out.println(de_que);

	}

}
