package Array;

public class DecimalArray
{
	public static void main(String[] args) 
	{
		int []arr={1,0,1,0,1};
		int p=1;
		int dec=0;
		for (int i=arr.length-1;i>=0 ;i-- )
		{
			dec=dec+arr[i]*p;
			p*=2;
		}
		System.out.println(dec);
	}

}
