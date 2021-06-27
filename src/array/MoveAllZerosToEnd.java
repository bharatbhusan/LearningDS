package array;

import java.util.Arrays;

public class MoveAllZerosToEnd 
{
	public static void main(String args[])
	{
		int arr[]= {10,8,0,50,0,0,6,0,0,7,10,0};
		Arrays.stream(arr).forEach(e->System.out.print(e+" "));
		moveAllZerosToEnd(arr);
		System.out.println();
		Arrays.stream(arr).forEach(e->System.out.print(e+" "));

	}
	public static void moveAllZerosToEnd(int arr[])
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp = arr[count];
				arr[count]=arr[i];
				arr[i] = temp;
				count++;
			}
		}
	}
}
