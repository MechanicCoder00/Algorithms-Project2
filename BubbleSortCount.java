package project2;

import java.util.Arrays;

public class BubbleSortCount {

	public static void bSortCount(int[] arr)  
	{
		int swaps = 1;
		for(int i=0; i < arr.length && swaps !=0; i++)
		{
			swaps = 0;
		    for(int j=arr.length-1; j > i; j--) 
		    {
		    	if(arr[j] < arr[j-1])
		    	{
		    		int temp = arr[j];
		    		arr[j] = arr[j-1];
		    		arr[j-1] = temp;
		    		swaps++;
		    	}
		    }
		}
	}
	
	public static void main(String args[])
	{
		int[] arr = {5,42,13,21,1};
		bSortCount(arr);
		System.out.println("Sorted Array" + " :" + Arrays.toString(arr));
		
		int a100k =  100000;
		int[] random100k = RWArrays.read("R100k.txt",a100k);
//		int[] sorted10k = RWArrays.read("S10k.txt",a10k);
//		int[] almostsorted10k = RWArrays.read("AS10k.txt",a10k);
		
		System.out.println("Sorted Array" + " :" + Arrays.toString(random100k));
		System.out.print("BubbleSortCount Random 100k :");
		Timecompare.bctime(random100k);
		System.out.println("Sorted Array" + " :" + Arrays.toString(random100k));
//		System.out.print("BubbleSortCount Sorted 10k :");
//		Timecompare.bctime(sorted10k);
//		System.out.print("BubbleSortCount Almost Sorted 10k :");
//		Timecompare.bctime(almostsorted10k);
	}
}