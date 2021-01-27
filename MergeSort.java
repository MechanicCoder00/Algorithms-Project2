package project2;

import java.util.Arrays;

public class MergeSort {

	public static void mSort(int[] arr, int p, int r)
	{
		if(p<r)
		{
	        int q = (p+r)/2;
	        mSort(arr,p,q);
	        mSort(arr,q+1,r);
	        merge(arr,p,q,r);
	    }

	}

	static void merge(int arr[],int p,int q,int r)
	{
	    int lowerarr[],upperarr[];

	    lowerarr = new int[q-p+1];
	    upperarr = new int[r-q];

	    for(int i=0 ; i< (q-p+1); i++)
	    {
	        lowerarr[i] = arr[p+i];
	    }

	    for(int j=0; j< (r-q); j++)
	    {
	        upperarr[j] = arr[q+j+1];
	    }

	    int i=0,j=0;

	    for(int k=p;k<=r;k++)
	    {
	        if(i!= lowerarr.length && (j==upperarr.length || lowerarr[i] < upperarr[j]))
	        {
	            arr[k] = lowerarr[i];
	            i++;
	        }
	        else {
	            arr[k] = upperarr[j];
	            j++;
	        }
	    }
	}
	
	public static void main(String args[])
	{
		int[] arr = {5,42,13,21,1};
		mSort(arr, 0, arr.length-1);
		System.out.println("Sorted Array" + " :" + Arrays.toString(arr));
	}
}