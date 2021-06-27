package array;

public class LargestElement {

	public static void main(String[] args) 
	{
		int arr[] = {5,8,20,10,-10};
		System.out.println(maxElement(arr, arr.length));
	}
	
	public static int maxElement(int arr[],int n)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		
		return max == Integer.MIN_VALUE?-1:max;
		
	}

}
