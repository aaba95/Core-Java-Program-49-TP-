package com.cjc.programme;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check weather it is prime or not");
		
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("Given Number is Prime Number");
		}
		else {
			System.out.println("Given Number is Not Prime Number");
		}
		
		
	}
}
