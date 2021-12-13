package com.basicprogrammes;
import java.util.Scanner;
public class BasicProg {

	public static void main(String[] args) {
		System.out.println("Welcome to a  factorization programme!!");
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter a number:: ");
		 int num=sc.nextInt();
		boolean check=false;
		 for(int i=2; i<=num/2; i++) {
			 int rem=num%i;
			
			 if(rem==0) {
				 System.out.println("The  Factor of "+ num+ " is "+i);
               check=true;					 
			 }
		 }
		
           if(check==false) {
        	  
        	   System.out.println("The  Factor of "+ num+ " is "+num+" and "+1);
           }
        }
	}

