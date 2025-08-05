package com.cjc.programme;

public class OddandEven {

	
	
	public static void main(String[] args) {
		String evenno = "";
		String oddno="";
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				evenno=evenno+i+" , ";
			}
			else {
				oddno=oddno+i+" , ";
			}
		}
		System.out.print("Even no from 1 to 100 :");
		System.out.println(evenno);
		System.out.print("Odd no from 1 to 100 :");
		System.out.println(oddno);
		
	}
}
