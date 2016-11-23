package sortingMethods;

public class QuickSort {
	static int iterations =0;
	
	public static void sort(int a[], int start, int end)
	{
		if(start>=end)return;
		
		int k = start;
		int j = end;
		int pivotValue = a[(start+end)/2];
		
		while (k<j)
		{
			while(a[k]<pivotValue)
			{
				k++;
			}
			while(pivotValue<a[j])
			{
				j--;
			}
			if(k<=j)
			{
				int temp = a[k];
				a[k] = a[j];
				a[j] = temp;
				k++;
				j--;
				iterations++;
				
			}
		}
		sort(a,start,j);
		sort(a,k,end);
	}
	
	public static void iterationAmount()
	{
		System.out.println("Number of iterations: " + iterations);
	}
}
