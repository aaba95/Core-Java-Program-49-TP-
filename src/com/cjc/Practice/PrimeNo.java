package com.cjc.Practice;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number here To check weather its prime or not");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("Number is not Prime Number");
		}
		else {
			System.out.println("Number is  Prime Number");
		}
		
	}
}
