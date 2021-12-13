package com.basicprogrammes;
import java.util.Scanner;
public class BasicProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First number ::");
		int num1=sc.nextInt();
		System.out.print("Enter Second number ::");
		int num2=sc.nextInt();
		System.out.print("Enter Third number ::");
		int num3=sc.nextInt();

		if(num1>num2 &&num1>num3) {
			System.out.print(num1+" is greater");
		}
		else if(num2>num1 &&num2>num3) {
			System.out.print(num2+" is greater");
	}
		else {
			System.out.print(num3+" is greater");
		}
	}
}


