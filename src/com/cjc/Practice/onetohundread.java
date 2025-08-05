package com.cjc.Practice;

public class onetohundread {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum=i+sum;
		}
		System.out.println("Addition from 1 to 100  : "+sum);
		
	}
}
