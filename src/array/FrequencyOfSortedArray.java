package array;

public class FrequencyOfSortedArray {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,2,3,3};
		freqSortedArray(arr);

	}
	/*
	 * Time complexity - O(n)
	 * Space Complexity - O(1)
	 * Array having one element - length ==1
	 * Last element is not repeated but last but one repeated - arr[i-1]!=arr[i-2]
	 * i<length in the inner while - required to avoid array index out of bounds in case of last element is repeated 
	 */
	
	public static void freqSortedArray(int arr[])
	{
		int length = arr.length;
		int freq = 1;
		int i=1;
		while(i<length)
		{
			while(i < length && arr[i]==arr[i-1])
			{
				freq++;
				i++;
			}
			System.out.println("Frequence of "+arr[i-1]+" is "+freq);
			i++;
			freq=1;
		}
		if(length ==1 || arr[i-1]!=arr[i-2])
			System.out.println("Frequence of "+arr[i-1]+" is "+freq);
	}

}
