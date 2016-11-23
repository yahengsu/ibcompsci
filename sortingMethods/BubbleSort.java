package sortingMethods;

public class BubbleSort {
	
	static int iterations =0;
	
	public static void sort(int a[])
	{
		boolean loopable;
		do
		{
			loopable = false;
			for (int j=0; j<a.length-1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					iterations++;
					
					loopable = true;
				}
			}
		}while (loopable);
	}
	
	public static void iterationAmount()
	{
		System.out.println("Number of iterations: " + iterations);
	}
}
