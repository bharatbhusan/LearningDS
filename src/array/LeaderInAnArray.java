package array;

public class LeaderInAnArray
{
	public static void main(String args[])
	{
		int arr[] = {7,10,4,10,6,5,2};
		leaderInAnArray(arr);
	}
	
	/*
	 * Time complexity - O(n)
	 * Space complexity - O(1)
	 */
	public static void leaderInAnArray(int arr[])
	{
		int n = arr.length;
		int max = arr[n-1];
		System.out.print(max+" ");
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				System.out.print(max+" ");
			}
		}
	}
}
