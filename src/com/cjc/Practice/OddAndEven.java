package com.cjc.Practice;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		OddAndEven obj=new OddAndEven();
		obj.m1();
		
		
	}

	public void m1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Check weather Number is Odd or Even");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is Even Number");
		}
		else {
			System.out.println("Number is Odd Number");
		}
	} 
}
