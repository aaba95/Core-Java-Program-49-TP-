package com.cjc.programme;

import java.util.Scanner;

public class PallindromeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the Number To check weather the number is Pallindrome or not");
		int num = sc.nextInt();
		int temp = num;

		int rem = 0;
		int sum = 0;

		while (num != 0) {
			rem = num % 10;
			sum = rem + sum * 10;
			num = num / 10;
		}

		if (temp == sum) {
			System.out.println("Number is Pallindrome Number");
		} else {
			System.out.println("Number is not Pallindrome Number");
		}

	}
}
