package com.cjc.Practice;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number here to check weather it is Pallindrome or Not");
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;
	
		while(num!=0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("Number is Pallindrome Number");
		}
		else{
			System.out.println("Number is Not Pallindrome Number");
		}
		
	}
}
