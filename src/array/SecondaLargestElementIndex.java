package array;

public class SecondaLargestElementIndex {

	public static void main(String[] args)
	{
		int arr[] = {9,9,9,8};
		System.out.println(secondLargestElement(arr));

	}

	private static int secondLargestElement(int[] arr) {
		
		int largest =0;
		int res = -1;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] > arr[largest])
			{
				res = largest;
				largest = i;
			}
			else if(arr[i]!=arr[largest])
			{
				if(res ==-1 || arr[i] > arr[res])
					res = i;
			}
		}
		return res;
		
	}

}
