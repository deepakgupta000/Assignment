package com.Practice;

import java.util.Scanner;


public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two number");

		int n1=sc.nextInt();
		int n2=sc.nextInt();
		while(n1 % n2 != 0) 
		{
			int rem = n1 % n2;
			n1=n2;
			n2=rem;
			
		}
		int HCF = n2;
				System.out.println("Two number of HCF = "+HCF);
				
				sc.close();

	}

}
