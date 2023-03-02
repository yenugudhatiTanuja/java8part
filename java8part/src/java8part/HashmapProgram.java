package java8part;

import java.util.HashMap;
//import java.util.Hashtable;

public class HashmapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,String>  hm=new HashMap<>();
     hm.put(1, "tanu");
     hm.put(2, "vanu");
     hm.put(3, "ammu");
     hm.put(4, "pinky");
     System.out.println("Elements in hashmap----->"+hm);
     System.out.println("entrySet----->"+hm.entrySet());
     System.out.println("check HashMap is Empty or not:---->"+hm.isEmpty());
     System.out.println("containsKey() check 3:---->"+hm.containsKey(3));
     System.out.println("containsValue() check tanu:---->"+hm.containsValue("tanu"));
    // System.out.println("entrySet----->"+hm.entrySet());
     String s=hm.get(1);
     System.out.println("get() prints value of key1 ----->"+s);
     String k=hm.getOrDefault(1, "Orange");
     System.out.println("default value:----->"+k);
     System.out.println("Elements in hashmap----->"+hm);
     //hm.keySet();
     System.out.println("KeySet----->"+hm.keySet());
     //hm.put(5, k)
     hm.replace(2, "Pink");
     System.out.println("After replace Elements in hashmap----->"+hm);
     System.out.println("getting only values----->"+hm.values());
     hm.remove(1);
     System.out.println("After remove Elements in hashmap----->"+hm);
     //hm.remove(3,"ammu");
     //System.out.println("After remove value Elements in hashmap----->"+hm);
     hm.replace(3, "yellow");
     System.out.println("After replace Elements in hashmap----->"+hm);
     hm.putIfAbsent(5, "Car");
     System.out.println("putifAbsent()----->"+hm);
     hm.replace(4, "pinky", "Green");
     System.out.println("replace----->"+hm);

     //System.out.println(hm.remove(2, "pink"));
     




     
	}

}
