package com.Practice;

import java.util.Scanner;

public class VowelandCosonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char c=sc.next().charAt(0);
		
		if(c=='a'||c=='A' || c=='e'||c=='E' || c=='i'||c=='I' || c=='o'||c=='O' || c=='u'||c=='U')
		{
			System.out.println(c+" "+"is Vowel");
		}else
		{
			System.out.println(c+" "+"is consonant");

		}
	}

}
