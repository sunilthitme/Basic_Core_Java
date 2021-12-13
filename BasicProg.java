package com.basicprogrammes;
import java.util.Scanner;

import com.vovel.VovelConsonent;
public class BasicProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any character ::");
		 char ch=sc.next().charAt(0);
      char []vovel= {'a','e','i','o','u','A','E','I','O','U'};
      
      VovelConsonent check=new VovelConsonent();
      
      for(int i=0;i<vovel.length; i++) {
    	  int compare = Character.compare(vovel[i], ch);
    	  if(compare==0) {
    		  System.out.println(ch+" character is vovel");
    		  System.exit(0);
    	  }
      }
    		  System.out.println(ch+" character is Consonent");
    	  }
	}
      


