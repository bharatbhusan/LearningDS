package array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,3,90,20};
		reverseArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void reverseArray(int arr[])
	{
		int low =0;
		int high = arr.length-1;
		while(low < high)
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high --;
		}
	}
}
