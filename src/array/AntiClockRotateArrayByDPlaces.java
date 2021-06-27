package array;

import java.util.Arrays;

public class AntiClockRotateArrayByDPlaces 
{
	
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5};
		Arrays.stream(arr).forEach(k->System.out.print(k+" "));
		rotateAntiClockWiseEfficient(arr,2);
		System.out.println();
		Arrays.stream(arr).forEach(k->System.out.print(k+" "));
	}
	
	/*
	 * Time Complexity - O(nd)
	 * Space Complexity - O(1)
	 */
	public static void rotateAntiClockWise(int arr[],int d)
	{
		int n = arr.length;
		d = d%n;
		for(int i=0;i<d;i++)
		{
			int temp = arr[0];
			for(int j=1;j<n;j++)
			{	
				arr[j-1] = arr[j];
				
			}
			arr[n-1]= temp;
		}
	}
	/*
	 * Time Complexity - O(n)
	 * Space Complexity - O(d)
	 */
	public static void rotateAntiClockWiseBetter(int arr[],int d)
	{
		int n = arr.length;
		d = d%n;
		int temp [] = new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i] = arr[i];
		}
		for(int i=d;i<n;i++)
		{
			arr[i-d] = arr[i];
		}
		for(int i=0;i<d;i++)
		{
			arr[n-d+i] = temp[i];
		}
	}
	
	/*
	 * Time Complexity - O(n)
	 * Space Complexity - O(1)
	 */
	public static void rotateAntiClockWiseEfficient(int arr[],int d)
	{
		int n = arr.length;
		d = d%n;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	
	public static void reverse(int arr[],int low,int high)
	{
		while(low < high)
		{
			int temp = arr[low];
			arr[low]= arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	
}
