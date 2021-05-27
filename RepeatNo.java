//program 3
//To find repeated number in sorted array

import java.util.Scanner;
class RepeatNo
{
public static void repeatedNo(int arr[])
	{
		int i=0,j=1;
	while(j<8)
	{
		if(arr[i]==arr[j])
		{
			break;
		}
		else
		{
			i=i+1;
			j=j+1;
		}
	}
	System.out.println(arr[i]);
	}
public static void main(String args[])
	{
	int[] arr1=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array elements-->");
	for(int i=0;i<10;i++)
	{
		arr1[i]=sc.nextInt();
	}
	System.out.println("repeated number is-->");
	repeatedNo(arr1);
	}
}
