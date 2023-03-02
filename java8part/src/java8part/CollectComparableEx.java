package java8part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Phone
{
	int price;
	String brand;
	String model;
	public Phone(String brand,int price,String model)
	{
		this.brand=brand;
		this.price=price;
		this.model=model;
	}
	public String toString()
	{
		return this.brand+"   "+this.price+"  "+this.model;
		
	}
}
class sortByBrand implements Comparator<Phone>
{

	@Override
	public int compare(Phone a, Phone b) {
		// TODO Auto-generated method stub
		return a.brand.compareTo(b.brand);
	}
	
}
class sortByPrice implements Comparator<Phone>
{

	@Override
	public int compare(Phone a, Phone b) {
		// TODO Auto-generated method stub
		return a.price-b.price;
	}
	
}
class sortByModel implements Comparator<Phone>
{

	@Override
	public int compare(Phone a, Phone b) {
		// TODO Auto-generated method stub
		return a.model.compareTo(b.model);
	}
	
}
public class CollectComparableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Phone> arr=new ArrayList<Phone>();
     arr.add(new Phone("Samsung",23000," Galaxy_A7"));
     arr.add(new Phone("Apple",45000,"Apple_iphone_12pro"));
     arr.add(new Phone("Xiaomi",15000,"Xiaomi_Redmi_k25"));
     System.out.println("Before sorting Array");
     for(int i=0;i<arr.size();i++)
     {
    	 System.out.println(arr.get(i));
     }
     Collections.sort(arr,new sortByBrand());
     System.out.println("After sort by brand");
     for(int i=0;i<arr.size();i++)
     {
    	 System.out.println(arr.get(i));
     }
     Collections.sort(arr,new sortByPrice());
     System.out.println("After sort by price");
     for(int i=0;i<arr.size();i++)
     {
    	 System.out.println(arr.get(i));
     }
     Collections.sort(arr,new sortByModel());
     System.out.println("After sort by Model");
     for(int i=0;i<arr.size();i++)
     {
    	 System.out.println(arr.get(i));
     }
	}

}
