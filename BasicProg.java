package com.basicprogrammes;
import java.util.Scanner;
public class BasicProg {

		public static void main(String[] args) {
			System.out.print("Enter number is (less than 31) ::");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			if(n<=31) {
			for( int i=1;i<=n;i++ )
			{    
				int table =2*i;
			    System.out.println(table);
			}
			}
			else {
				System.out.println("Invalid number!!");
			}

		}

	}