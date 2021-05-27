//program 1
//To find Even no in array

import java.util.Scanner;
class PrintEven{
 public static void evenNo(int arr[])
	{
	for(int i=0;i<arr.length;i++)
		{
		if(arr[i]%2==0)
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{
	int[] arr1=new int[]{1,2,3,4,5,6};
	
	System.out.println("Even no. are-->");
	evenNo(arr1);
    }
}