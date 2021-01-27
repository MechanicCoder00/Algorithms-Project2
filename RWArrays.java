package project2;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RWArrays
{
	public static void write(String filename, int[]x)
	{
		try
		{
			BufferedWriter outputWriter = null;
			outputWriter = new BufferedWriter(new FileWriter(filename));
			for (int i = 0; i < x.length; i++)
			{
				outputWriter.write(x[i]+"");
				outputWriter.newLine();
			}
			outputWriter.flush();  
			outputWriter.close();  
		}	catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static int[] read(String filename, int n)
	 {
			int[] temparr = new int [n];
        try
        {
        	FileReader file = new FileReader(filename);
            
            int i=0;

            Scanner input = new Scanner(file);
            while(input.hasNext())
            {
            	temparr[i] = input.nextInt();
                i++;
            }
            input.close();
        }	catch(Exception e)
	        {
	            e.printStackTrace();
	        }
			return temparr;
    }
	
	public static int[] createarr(int n)
	{
		int randarr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
		    randarr[i] = (int)(Math.random()*10000+1);
		}
		return randarr;
	}
	
	public static int[] changearr10(int[] arr2, int n)
	{
		for (int i = 9; i < n-10; i=i+10)
		{
			while((arr2[i] >= arr2[i-1]) && (arr2[i] <= arr2[i+1]))
			{
				arr2[i] = (int)(Math.random()*10000+1);
//				System.out.println("Corrected element " + (i+1));
			}
		}
		while((arr2[n-1] >= arr2[n-2]))
		{
			arr2[n-1] = (int)(Math.random()*10000+1);
//			System.out.println("Corrected element " + n);
		}
		
		
		return arr2;
	}
	
	public static void main(String[] args)
	{
//		int arrsize = 100000;
		
		//Creating new arrays
//		int arr[] = createarr(arrsize);	
//		System.out.println("New Random Array" + " :" + Arrays.toString(arr));
//		write("randomarr.txt" , arr);
//		QuickSort.qSort(arr, 0, arr.length-1);
//		System.out.println("Sorted Array" + " :" + Arrays.toString(arr));
//		write("sortedarr.txt" , arr);
//		arr = changearr10(arr,arrsize);
//		System.out.println("Sorted Array" + " :" + Arrays.toString(arr));
//		write("sorted10arr.txt", arr);
		
		
		
		
		//Reading arrays from files
//		int[] arr = read("S10k.txt",arrsize).clone();
//		System.out.println("Sorted Array" + " :" + Arrays.toString(arr));
//		arrsize = 1000;
//		arr = read("S1k.txt",arrsize).clone();
//		System.out.println("Sorted Array" + " :" + Arrays.toString(arr));
	}
}
