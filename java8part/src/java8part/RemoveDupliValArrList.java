package java8part;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupliValArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> dv=new ArrayList<>();
       dv.add(1);
       dv.add(2);
       dv.add(3);
       dv.add(4);
       dv.add(1);
       dv.add(2);
       dv.add(3);
       dv.add(4);
       List<Integer> nl=dv.stream().distinct().collect(Collectors.toList());
       System.out.println("duplicate list"+dv);
       System.out.println("newlist"+nl);


	}

}
