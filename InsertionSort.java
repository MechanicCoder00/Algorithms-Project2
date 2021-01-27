package project2;

import java.util.Arrays;

public class InsertionSort {

	public static void iSort(int[] arr)  
	{
		int i, j, temp;
	    for (i = 1; i < arr.length; i++)
	    {
	        j = i - 1;
	        while (j >= 0 && arr[j] > arr[i] )
	        {
	            temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i=j;
	            j--;
	        }
	    }
	}
	
	public static void main(String args[])
	{
		int[] arr = {5,42,13,21,1};
		iSort(arr);
		System.out.println("Sorted Array" + " :" + Arrays.toString(arr));
	}
}