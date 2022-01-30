package Myfirst;

public class PrintNumberIndex {

	static int findIndex(int a[],int t)
	{
		if(a==null)
		{
			return -1;
		}
		
		int len=a.length;
		int i=0;
		
		while(i<len)
		{
			if(a[i]==t)
			{
				return i;
			}
			else {
				i=i+1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,52,1,6,8,9,0};
		
		System.out.println(findIndex(a,64));
	}

}
