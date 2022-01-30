package Myfirst;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,1,0,8,9,6,7};
		int num=5;
		boolean found=false;
		for(int n:a)
		{
			if(n==num)
			{
				found=true;
				break;
			}
		}
		if(found)
		{
			System.out.println(num+" "+ "Number is Found");
		}else {
			System.out.println(num+" "+ "Number is not Found");
		}

	}

}
