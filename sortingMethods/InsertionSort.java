package sortingMethods;

public class InsertionSort {
	
	static int item,j;
	static int iterations = 0;
	public static void sort(int a[])
	{
		boolean loopable;
		
		for(int k=1; k<a.length; k++)
		{
			item = a[k];
			j = k-1;
			loopable = true;
			
			while((j>=0) && loopable)
			{
				if(item <a[j])
				{
					a[j+1] = a[j];
					j--;
					iterations ++;
					if (j==-1)
						a[0] = item;
				}
				else
				{
					loopable = false;
					a[j+1] = item;
				}
			}

		}
	}
	
	public static void iterationAmount()
	{
		System.out.println("Number of iterations: " + iterations);

	}

}
