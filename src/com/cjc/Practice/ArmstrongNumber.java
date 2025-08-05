package com.cjc.Practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number here to check weather it is Armstrong or not");
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;
		
		while(num!=0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("Number is Armstrong Number");
		}
		else {
			System.out.println("Number is Not Armstrong Number");
		}
		
	}
}
