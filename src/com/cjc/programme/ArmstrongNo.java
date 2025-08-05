package com.cjc.programme;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("To check weather given no is Armstrong Number or Not");
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;
		
		
	  while(num!=0) {
		  rem=num%10;
		  sum=(rem*rem*rem) + sum;
		  num=num/10;
		  
	  }
	  
	  if(temp==sum) {
		  System.out.println("Number is Armstrong Number");
	  }
	  else {
		  System.out.println("Number is not Armstrong number");
	  }
		
		
	}
}
