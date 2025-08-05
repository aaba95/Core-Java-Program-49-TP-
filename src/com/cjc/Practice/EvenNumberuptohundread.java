package com.cjc.Practice;

public class EvenNumberuptohundread extends OddAndEven{

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
			sum=i+sum;
			}
		}
		System.out.println("Addition of Even Number from 1 to 100 : "+sum);
		OddAndEven obj=new OddAndEven();
		obj.m1();
	}
}
