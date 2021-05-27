import java.util.Scanner;
class PrintEven{
 public static String evenNo(int arr[])
	{
	for(int i=0;i<arr.length;i++)
		{
		if(arr[i]%2==0)
			System.out.println(arr[i]);
		}
		return null;
	}
	public static void main(String args[])
	{
	int[] arr1=new int[]{1,2,3,4,5,6};
	
	System.out.println("Even no. are-->");
	
	System.out.println(evenNo(arr1));
    }
}