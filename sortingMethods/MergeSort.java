package sortingMethods;

public class MergeSort {
	static int iterations =0;
	public static void sort (int a[], int left, int right)
	{
		if (right == left)return;
			int middle = (left + right) / 2;
			sort(a, left, middle);
			sort(a, middle+1, right);
			merge(a, left, middle, right);
		

	}
	
	public static void iterationAmount ()
	{
		System.out.println("Number of iterations: " + iterations);
	}
	
	public static void merge (int a[], int left, int middle, int right)
	{
		int tempArray[] = new int[right-left+1];
		
		int index1 = left; 
		int index2 = middle+1;
		int index = 0;
		
		
		while(index1 <=middle && index2<=right)
		{
			if(a[index1] < a[index2])
			{
				tempArray[index] = a[index1];
				index1++;
			}
			else
			{
				tempArray[index] = a[index2];
				index2++;
			}
			index++;
			iterations++;
		}
		while(index1<=middle)
		{
			tempArray[index] = a[index1];
			index1++;
			index++;
			iterations++;
			
		}
		while(index2<=right)
		{
			tempArray[index] = a[index2];
			index2++;
			index++;
			iterations++;
		}
		
		for(index=0; index<tempArray.length;index++)
		{
			a[left +index] = tempArray[index];
		}
	}
	
}
