package java8part;

import java.util.ArrayList;

public class ArrayListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> arrl=new ArrayList<>();
        arrl.add(1);
        arrl.add(1, 5);//index
        arrl.add(6);
        arrl.add(7);
        System.out.println(arrl.getClass());
        System.out.println(arrl.size());
        System.out.println("ArrayList:   "+arrl);
        arrl.remove(1);//remove based on index
        System.out.println("ArrayList:   "+arrl);
       // arrl.remove(0); 
        arrl.set(0, 2);//it sets 2 at location 0
        System.out.println("ArrayList:   "+arrl);
        int b=arrl.get(0);
        System.out.println("ArrayList:  "+b);
        System.out.println("ArrayList:   "+arrl);
        arrl.removeAll(arrl);
        System.out.println("ArrayList:   "+arrl);
        arrl.clear();
        System.out.println("ArrayList:   "+arrl);
        //Sysarrl.size();


        


	}

}
