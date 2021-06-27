package array;

public class MaximumLengthEvenOddSubArray {

	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,9,9,10};
		System.out.println(maxLenEvenOddSubArray(arr));
	}
	
	public static int maxLenEvenOddSubArray(int arr[])
	{
		int res = 1;
		int length = arr.length;
		int count =1;
		for(int i=1;i<length;i++)
		{
			if((arr[i]%2 ==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0))
			{
				count++;
				res = Math.max(res, count);
			}
			else
			{
				count = 1;
			}
		}
		
		return res==1?0:res;
	}

}
