package com.Practice;

import java.util.Scanner;

public class GusseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int randomNum=(int)(Math.random()*100)+1;
		System.out.println(randomNum);
		int guess=0,attempt=0;
		
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter a number 0 to 100");
			guess=sc.nextInt();
			attempt=attempt+1;
			
			if(guess>randomNum)
				System.out.println("Sorry's number is hige");
			
			else if(guess<randomNum)
			    System.out.println("Sorry's number is low");
			
			else
				
				System.out.println("Congratulation it is corret in "+ attempt +" attempt");

			
		}while(randomNum!=guess);
		
	}

}
