package project2;

import java.util.Arrays;

public class SelectionSort {

	public static void sSort(int[] arr)  
	{
		int min = 0;

		for(int i = 0;i<arr.length;i++)
		{
			min = i;
			for(int j = i + 1;j<arr.length;j++)
			{
				if(arr[j] < arr[min]) { min = j;}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	public static void main(String args[])
	{
		int[] arr = {5,42,13,21,1};
		sSort(arr);
		System.out.println("Sorted Array" + " :" + Arrays.toString(arr));
	}
}