package com.cjc.Practice;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word here to check weather it is Pallindrome or not");
		String str=sc.next();
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		if(str.equals(rev)) {
			System.out.println("String is pallindrome");
		}
		else {
			System.out.println("String is not pallindrome");
		}
		
	}
}
