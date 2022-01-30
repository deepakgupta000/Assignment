package com.Practice;

import java.util.Scanner;

public class SumofAllDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int d=0;
		while(n>0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;

		}
		System.out.println(sum);

		sc.close();
	}

}
