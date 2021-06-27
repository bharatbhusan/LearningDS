package array;

import java.util.Arrays;

public class LeftRotateArrayBy1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int arr[]= {1,2,3,4,5};
		 Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
		 LeftRotateArray(arr);
		 Arrays.stream(arr).forEach(e->System.out.print(e+" "));
	}
	
	public static void LeftRotateArray(int arr[])
	{
		int temp = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		System.out.println();
	}

}
