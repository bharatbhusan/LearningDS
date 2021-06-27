package array;

public class MaximumSumSubArray
{

	public static void main(String args[])
	{
		int arr[] = {-5,1,-2,3,-1,2,-2};
		System.out.println(maximumSubArray(arr));
	}
	/*
	 * Time Complexity -O(n) Space Complexity - O(1)
	 * Kadane's Algorithim
	 * Maximum Sum
	 */
	public static int maximumSubArray(int arr[])
	{
		int sum=arr[0];
		int maxSum = arr[0];
		int n = arr.length;
		for(int i=1;i<n;i++)
		{
			sum = Math.max(sum+arr[i], arr[i]);
			
			maxSum = Math.max(maxSum, sum);
		}
		
		return maxSum;
	}
}
