package com.basicprogrammes;

public class BasicProg {

	public static void main(String[] args) {
		double flipCoin =   Math.random();
		if (flipCoin<0.5) {
		System.out.println("tails");
	}
		else {
			System.out.println("head");
		}
	}
}
