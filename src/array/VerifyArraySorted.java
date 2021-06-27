package array;

public class VerifyArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100,300,400};
		System.out.println(isArraySorted(arr));
	}
 
	private static boolean isArraySorted(int[] arr) {
		
	
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i-1]>arr[i])
			{
				return false;
			}
			
		}
		
		return true;
	}

}
