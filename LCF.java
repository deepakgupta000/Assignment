package com.Practice;

import java.util.Scanner;

public class LCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two number");

		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int or1=n1;
		int or2=n2;
		
		while(n1 % n2 != 0) 
		{
			int rem = n1 % n2;
			n1=n2;
			n2=rem;
			
		}
		int HCF = n2;
				System.out.println("Two number of HCF = "+HCF);
				
				int LCF = or1*or2/HCF; 
				System.out.println("Two number of LCF = "+LCF);
				
				sc.close();
	}

}
