import java.util.Scanner;
class MaxValueArray
{
public static int maxOne(int arr[])
	{
	int count=0,finalValue=0;
	for(int i=0;i<arr.length;i++)
		{
		if(arr[i]==1)
			{
			count++;
			if(count>finalValue)
				finalValue=count;
			}
		else
			count=0;
		}
		return finalValue;
	}
public static void main(String args[])
	{
	int[] arr1=new int[]{1,0,1,1,1,0,0,1,1,0,1};
	System.out.println("max length of 1's-->" +maxOne(arr1));
	}
}
