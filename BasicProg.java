package com.basicprogrammes;
import java.util.Scanner;
public class BasicProg {

	public static void main(String[] args) {
		System.out.println("Welcome to harmonic number programme!!");
		System.out.print("Please enter a Number::");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1; i<=num; i++) {
			
			System.out.print( "1/"+  i );
			if( i<num) {
				System.out.print( " + " );
			}
		}
		

	}

}