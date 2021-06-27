package array;

public class RemoveDupSortedArray {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,20,30,30,30};
		System.out.println(removeDup(arr));

	}
	
	public static int removeDup(int arr[])
	{
		int res = 1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[res-1])
			{
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
	}

}
