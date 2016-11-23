package sortingMethods;

public class SelectionSort {
	
	static int iterations = 0;
	
	public static void sort(int a[])
	{
		int min, minIndex;
		for(int i =0; i<a.length; i++)
		{
			min = a[i];
			minIndex = i;
			for(int j=i+1; j<a.length; j++)//finds minimum
			{
				if(a[j] < min)//salient 
				{
					min = a[j];
					minIndex = j;
				}

				iterations++;
			}
			a[minIndex] = a[i];//swap
			a[i] = min;
		}
		
		
	}
	
	public static void iterationAmount()//prints the number of iterations
	{
		System.out.println("Number of iterations: " + iterations);
	}
}
