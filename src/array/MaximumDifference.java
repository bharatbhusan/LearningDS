package array;

public class MaximumDifference {

	public static void main(String[] args) 
	{
		int arr[] = {2,3,10,6,4,8,1};
		
		System.out.println(maxDifferenceEfficient(arr));
	}
	
	/*
	 * Time Complexity - O(n2)
	 * Space Complexity - O(1)
	 */
	public static int maxDifference(int arr[])
	{
		int maxDiff=Integer.MIN_VALUE;
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				maxDiff = Math.max(maxDiff, arr[j]-arr[i]);
			}
		}
		
		return maxDiff;
		
	}
	
	public static int maxDifferenceEfficient(int arr[])
	{
		int maxDiff=Integer.MIN_VALUE;
		int min= arr[0];
		int n = arr.length;
		for(int i=1;i<n;i++)
		{
			maxDiff = Math.max(arr[i]-min,maxDiff);
			min = Math.min(arr[i], min);
		}
		
		return maxDiff;
		
	}

}
