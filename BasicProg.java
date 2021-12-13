package com.basicprogrammes;
import java.util.Scanner;
public class BasicProg {

		public static void main(String[] args) {
			System.out.print("Enter any Year(Please enter only 4 digit no.)::");
			Scanner sc=new Scanner(System.in); 
			int leap=sc.nextInt();
			int year=leap;
			 int i=1;
			 
			for( i=1; i<=year; i++) {
				 year=(year / 10);
			}
			if(i==4) {
				 leap(leap);
	          
			}
			else {
			System.out.println("Invalid number");		
			}
		}
	public static void leap(int leap) {
		int a=leap%4;
		int b=leap%400;
		int c=leap%100;
	     if (b==0 ||(a==0 && c!=0)) {
	    	 System.out.println(leap + " Leap Year");
	     }
	     else {
	    	 System.out.println(leap + " Not a leap year");
	     }
	}
	}
