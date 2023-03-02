package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchP {

	public static void main(String[] args) {
		// TODO Auto-generat.ed method stub
  /*  System.out.println("====>"+Pattern.matches(".s", "mk"));
    System.out.println("====>"+Pattern.matches(".ff", "mff"));
    System.out.println("====>"+Pattern.matches(".ff", "mFF"));
    System.out.println("====>"+Pattern.matches(".ff", "mf"));
    System.out.println("====>"+Pattern.matches(".ff.", "mfft"));
    System.out.println("***********************************");
    Pattern p= Pattern.compile(".s");
    Matcher m=p.matcher("ms");
    boolean b=m.matches();
    System.out.println(b);
    System.out.println("***********************************");
    System.out.println("====>"+Pattern.matches("[a-zA-Z]*", "AA"));
    System.out.println("====>"+Pattern.matches("[abc]", "abcd"));*/
     /*Pattern p=Pattern.compile("sample");  
	 Matcher m=p.matcher("Hellotanu");
    System.out.println(m.find());*/
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7953038949"));
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));





		/*Scanner sc=new Scanner(System.in);  
        while (true) {    
            System.out.println("Enter regex pattern:");  
            Pattern pattern = Pattern.compile(sc.nextLine());    
            System.out.println("Enter text:");  
            Matcher matcher = pattern.matcher(sc.nextLine());    
            boolean found = false;    
            while (matcher.find()) {    
                System.out.println("I found the text "+matcher.group()+" starting at index "+    
                 matcher.start()+" and ending at index "+matcher.end());    
                found = true;    
            }    
            if(!found){    
                System.out.println("No match found.");    
            }

	}*/

}
}
