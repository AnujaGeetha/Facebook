package Array;

public class BinaryArray 
{
	public static void main(String[] args) 
	{
		int num=29;
		int []arr=new int[8];
		for (int i=0;i<arr.length ;i++ )
		{
			arr[arr.length-1-i]=num%2;
			num/=2;
		}
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
	}

}
