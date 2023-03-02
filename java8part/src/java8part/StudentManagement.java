package java8part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
import java.util.Scanner;

public class StudentManagement {
       
	//private static Comparator comparator;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CollectStudent> sd=new ArrayList<CollectStudent>();
		 String name, age;
         int salary;
         //int count=0;
         Scanner s=new Scanner(System.in);
        
         while(true)
         {
        	 System.out.println("1.AddStudent data");
        	 System.out.println("2.Display details");
        	 System.out.println("3.no.of students");
        	 System.out.println("4.Delete");
        	 System.out.println("5.Update");
        	 System.out.println("6.Sort based on name");
        	 System.out.println("7.Exit");

        	 System.out.println("Enter your Choice");
        	 int choice=s.nextInt();
        	 switch(choice)
        	 {
        	 case 1:
        		 System.out.println("Enter name of the student");
        		 name=s.next();
        		 System.out.println("enter age");
        		 age=s.next();
        		 System.out.println("Enter salary");
        		 salary=s.nextInt();
        		 CollectStudent f= new CollectStudent();
        		 f.setName(name);
        		 f.setAge(age);
        		 f.setSalary(salary);
        		 sd.add(f);
        		 System.out.println("Student record has been added");
        		 break;
        	 case 2:
        		 for(int i=0;i<sd.size();i++)
        		 {
        			 System.out.println("Studen Record: "+(i+1));
        			 System.out.println("Student name:"+sd.get(i).getName());
        			 System.out.println("Student age:"+sd.get(i).getAge());
        			 System.out.println("Student salary:"+sd.get(i).getSalary());
        			 System.out.println("---------------------------------------");
        		 }
        		 break;
        	 case 3:
        		  System.out.println("Student count:"+sd.size());
        		  break;
        	 case 4:
        		System.out.println("Enter the name or age for deletion");
			    	name=s.next();
			    	int count=0;
			    	for(int i=0;i<sd.size();i++)
			    	{
			    		if(sd.get(i).getName().contains(name))
			    		{
			    			System.out.println("Count of names : "+(++count));
			    			sd.remove(i);
			    		}
			    	}
			    	if(count==0)
			    	{
			    		System.out.println("No Record is found");
			    	}
			    	else 
			    	{
			    		System.out.println("Record is Successfully deleted");
					}
			    	break;
        	 case 5:
        		 System.out.println("Enter employee name for updation");
			    	name=s.next();
			    	int count1=0;
			    	for(int i=0;i<sd.size();i++)
			    	{
			    		if(sd.get(i).getName().contains(name))
			    		{
			    			System.out.println("Count of names : "+(++count1));
			    			//sd.remove(i);
			    			System.out.println(sd.get(i).getName());
			    			System.out.println(sd.get(i).getSalary());
			    			System.out.println("Enter how much percentage");
			    			int per=s.nextInt();
			    			int d=sd.get(i).getSalary();
			    			d=d+((d/100)*per);
			    			sd.get(i).setSalary(d);
			    			System.out.println("salary update");
			    		}
			    	}
			    	if(count1==0)
			    	{
			    		System.out.println("Record Not Found");
			    	}
        		 break;
        	 case 6:  
        		 Collections.sort(sd,new Comparator<CollectStudent>() {

					@Override
					public int compare(CollectStudent o1, CollectStudent o2) {
						// TODO Auto-generated method stub
						return (o1.getName().compareTo(o2.getName())) ;
					}
				});
        		 System.out.println(sd);
        		 break;
        	 case 7:
        		 System.exit(0);
        	default:
            }
         }
	}

}
