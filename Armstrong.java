package com.Practice;

public class Armstrong 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=100;
		while(i<1000)
		{
			int n=i;
			int arm=0;
			while(n>0)
			{
				int rem=n%10;
				arm=arm+(rem*rem*rem);
				n=n/10;
			}
			if(arm==i) 
			{
				System.out.println(i);
			}
			i++;
		 }
	}

}
