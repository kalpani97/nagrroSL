package com.nagarro.sl.day1;

import java.util.Scanner;

public class IsNumDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = scn.nextInt();

		int div = 3;

		if(num % div == 0) {
			System.out.println("Yo divisible!");
		} else {
			System.out.println("Not divisible!");
		}

	}

}
