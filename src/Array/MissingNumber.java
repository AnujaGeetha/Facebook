package Array;
public class MissingNumber 
{
	public static void main(String[]args)
	{
	int a[]= {1,2,3,4,6};
	int sum=0;
	int n=(a.length)+1;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
		
	}
	int sumnum=(n*(n+1))/2;
	int missing=sumnum-sum;
	System.out.println(missing);
	}
}
