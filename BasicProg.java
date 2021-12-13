package com.basicprogrammes;
import java.util.Scanner;
public class BasicProg {

	public static void main(String[] args) {
		System.out.println("Enter a first number");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		int Quotient=num1/num2;
		int rem=num1%num2;
		System.out.println("Quotient is:: "+Quotient);
		System.out.println("Remainder is:: "+rem);

	}

}

