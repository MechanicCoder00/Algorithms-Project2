package project2;

import java.util.Arrays;

public class QuickSort {

	
	public static void qSort(int[] arr, int p, int r)
	{
	    if(p<r)
	    {
	        int q=partition(arr,p,r);
	        qSort(arr,p,q-1);
	        qSort(arr,q+1,r);
	    }
	}

	static int partition(int arr[], int p, int r) 
    { 
        int pivot = arr[r]; 
        int i = (p-1);
        for (int j=p; j<=r-1; j++) 
        { 
            if (arr[j] <= pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 

        int temp = arr[i+1]; 
        arr[i+1] = arr[r]; 
        arr[r] = temp; 
  
        return i+1; 
    }

	public static void main(String args[])
	{
		int[] arr = {5,42,13,21,1};
		qSort(arr, 0, arr.length-1);
		System.out.println("Sorted Array" + " :" + Arrays.toString(arr));
	}
}