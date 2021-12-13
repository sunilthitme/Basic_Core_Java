package com.basicprogrammes;
import java.util.Scanner;
public class BasicProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ::");
		 int num1=sc.nextInt();
		System.out.println("Enter second number ::");
		int num2=sc.nextInt();
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(" value of number 1 is ::" +num1);
		System.out.println(" value of number 2 is ::" +num2);
	}

}

