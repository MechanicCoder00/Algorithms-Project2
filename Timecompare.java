package project2;

import java.text.DecimalFormat;

public class Timecompare {

	static int timestorun = 1;
	
	public static void stime(int[] ar1)
	{
		double nanostartTime,nanostopTime,nanoelapsedTime,nanototalTime=0.0,nanototAvgtime=0.0;
		final DecimalFormat df2 = new DecimalFormat( "#.00" );
		int[] ar3 = ar1.clone();
		
		for(int i=0;i<timestorun;i++)
		{
			System.arraycopy(ar1, 0, ar3, 0, ar1.length);
			nanostartTime = System.nanoTime();
			SelectionSort.sSort(ar3);
			nanostopTime = System.nanoTime();
			nanoelapsedTime = nanostopTime - nanostartTime;
			nanototalTime += nanoelapsedTime;
		}
		nanototAvgtime = (nanototalTime/timestorun)/1000000;
		System.out.println("Average execution time : "+ (df2.format(nanototAvgtime)) +" ms");
	}
	
	public static void itime(int[] ar1)
	{
		double nanostartTime,nanostopTime,nanoelapsedTime,nanototalTime=0.0,nanototAvgtime=0.0;
		final DecimalFormat df2 = new DecimalFormat( "#.00" );
		int[] ar3 = ar1.clone();
		
		for(int i=0;i<timestorun;i++)
		{
			System.arraycopy(ar1, 0, ar3, 0, ar1.length);
			nanostartTime = System.nanoTime();
			InsertionSort.iSort(ar3);
			nanostopTime = System.nanoTime();
			nanoelapsedTime = nanostopTime - nanostartTime;
			nanototalTime += nanoelapsedTime;
		}
		nanototAvgtime = (nanototalTime/timestorun)/1000000;
		System.out.println("Average execution time : "+ (df2.format(nanototAvgtime)) +" ms");
	}
	
	public static void btime(int[] ar1)
	{
		double nanostartTime,nanostopTime,nanoelapsedTime,nanototalTime=0.0,nanototAvgtime=0.0;
		final DecimalFormat df2 = new DecimalFormat( "#.00" );
		int[] ar3 = ar1.clone();
		
		for(int i=0;i<timestorun;i++)
		{
			System.arraycopy(ar1, 0, ar3, 0, ar1.length);
			nanostartTime = System.nanoTime();
			BubbleSort.bSort(ar3);
			nanostopTime = System.nanoTime();
			nanoelapsedTime = nanostopTime - nanostartTime;
			nanototalTime += nanoelapsedTime;
		}
		nanototAvgtime = (nanototalTime/timestorun)/1000000;
		System.out.println("Average execution time : "+ (df2.format(nanototAvgtime)) +" ms");
	}
	
	public static void bctime(int[] ar1)
	{
		double nanostartTime,nanostopTime,nanoelapsedTime,nanototalTime=0.0,nanototAvgtime=0.0;
		final DecimalFormat df2 = new DecimalFormat( "#.00" );
		int[] ar3 = ar1.clone();
		
		for(int i=0;i<timestorun;i++)
		{
			System.arraycopy(ar1, 0, ar3, 0, ar1.length);
			nanostartTime = System.nanoTime();
			BubbleSortCount.bSortCount(ar3);
			nanostopTime = System.nanoTime();
			nanoelapsedTime = nanostopTime - nanostartTime;
			nanototalTime += nanoelapsedTime;
		}
		nanototAvgtime = (nanototalTime/timestorun)/1000000;
		System.out.println("Average execution time : "+ (df2.format(nanototAvgtime)) +" ms");
	}
	
	public static void qtime(int[] ar1, int p1, int r1)
	{
		double nanostartTime,nanostopTime,nanoelapsedTime,nanototalTime=0.0,nanototAvgtime=0.0;
		final DecimalFormat df2 = new DecimalFormat( "#.00" );
		int[] ar3 = ar1.clone();
		int p=p1;
		int r=r1;

		for(int i=0;i<timestorun;i++)
		{
			System.arraycopy(ar1, 0, ar3, 0, ar1.length);
			p=p1;
			r=r1;
			nanostartTime = System.nanoTime();
			QuickSort.qSort(ar3, p, r);
			nanostopTime = System.nanoTime();
			nanoelapsedTime = nanostopTime - nanostartTime;
			nanototalTime += nanoelapsedTime;
		}
		nanototAvgtime = (nanototalTime/timestorun)/1000000;
		System.out.println("Average execution time : "+ (df2.format(nanototAvgtime)) +" ms");
	}
	
	public static void mtime(int[] ar1, int p1, int r1)
	{
		double nanostartTime,nanostopTime,nanoelapsedTime,nanototalTime=0.0,nanototAvgtime=0.0;
		final DecimalFormat df2 = new DecimalFormat( "#.00" );
		int[] ar3 = ar1.clone();
		int p=p1;
		int r=r1;
		
		for(int i=0;i<timestorun;i++)
		{
			System.arraycopy(ar1, 0, ar3, 0, ar1.length);
			p=p1;
			r=r1;
			nanostartTime = System.nanoTime();
			MergeSort.mSort(ar3, p, r);
			nanostopTime = System.nanoTime();
			nanoelapsedTime = nanostopTime - nanostartTime;
			nanototalTime += nanoelapsedTime;
		}
		nanototAvgtime = (nanototalTime/timestorun)/1000000;
		System.out.println("Average execution time : "+ (df2.format(nanototAvgtime)) +" ms");
	}
	
	public static void main(String[] args)
	{
	}
}
