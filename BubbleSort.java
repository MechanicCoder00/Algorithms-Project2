package project2;


public class BubbleSort {

	public static void bSort(int[] arr)  
	{
		for(int i=0; i < arr.length; i++)
		{
		    for(int j=arr.length-1; j > i; j--) 
		    {
		    	if(arr[j] < arr[j-1])
		    	{
		    		int temp = arr[j];
		    		arr[j] = arr[j-1];
		    		arr[j-1] = temp;
		    	}
		    }
		}
	}
	
	
	public static void main(String args[])
	{
//		int[] arr = {5,42,13,21,1};
//		bSort(arr);
//		System.out.println("Sorted Array" + " :" + Arrays.toString(arr));
		
		
		int a10k =  10000;
		int[] random10k = RWArrays.read("R10k.txt",a10k);
		int[] sorted10k = RWArrays.read("S10k.txt",a10k);
		int[] almostsorted10k = RWArrays.read("AS10k.txt",a10k);

		
		System.out.print("BubbleSort Random 10k :");
		Timecompare.btime(random10k);
		System.out.print("BubbleSort Sorted 10k :");
		Timecompare.btime(sorted10k);
		System.out.print("BubbleSort Almost Sorted 10k :");
		Timecompare.btime(almostsorted10k);
	}
}