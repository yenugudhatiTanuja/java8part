package java8part;

//import java.util.HashMap;
import java.util.Hashtable;

public class Hashtableprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer,String>  ht=new Hashtable<>();
	     ht.put(1, "tanu");
	     ht.put(2, "vanu");
	    // System.out.println("Elements in hash table"+ht);
	     //System.out.println("containsValue()---->"+ht.containsValue("vanu"));
	    // System.out.println("ContaonsKey()------>"+ht.containsKey(3));
	     System.out.println("Elements in hashtable----->"+ht);
	     System.out.println("entrySet----->"+ht.entrySet());
	     System.out.println("check Hashtable is Empty or not:---->"+ht.isEmpty());
	     System.out.println("containsKey() check 3:---->"+ht.containsKey(3));
	     System.out.println("containsValue() check tanu:---->"+ht.containsValue("tanu"));
	    // System.out.println("entrySet----->"+hm.entrySet());
	     String s=ht.get(1);
	     System.out.println("get() prints value of key1 ----->"+s);
	     String k=ht.getOrDefault(1, "Orange");
	     System.out.println("default value:----->"+k);
	     System.out.println("Elements in hashmap----->"+ht);
	     //hm.keySet();
	     System.out.println("KeySet----->"+ht.keySet());
	     ht.replace(2, "Red");
	     System.out.println("After replace Elements in hashtable----->"+ht);
	     System.out.println("getting only values----->"+ht.values());
	     

	}

}
