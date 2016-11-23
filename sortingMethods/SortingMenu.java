package sortingMethods;

import java.util.Scanner;

public class SortingMenu {
	public static void main(String args[])
	{
		long startTime, endTime, totalTime;//initializes variables for calculating sorting time
		
		int randomNumbers[] = new int[10000];//new array with space for 10000 numbers
		for(int j=0; j<randomNumbers.length;j++)//fills the array with random numbers
		{
			int rng = (int)(Math.random()*10001);
			randomNumbers[j] = rng;
		}
		
		Scanner kbReader = new Scanner(System.in);//Switch to determine what kind of sort method to use
		System.out.println("Please choose what sorting method you would like to use.");
		System.out.println(" 1. Bubble Sort \n 2. Insertion Sort \n 3. Selection Sort \n 4. Merge Sort \n 5. Quick Sort");
		System.out.print("Please enter either 1, 2, 3, 4, or 5.\n");
		String sortType = kbReader.nextLine();//gets user input 
		int sort = Integer.parseInt(sortType);
		kbReader.close();
		
		
		//switch to separate the different types of sort methods
		switch (sort){
		
		case 1://Bubble sort
			startTime = System.nanoTime();
			
			BubbleSort.sort(randomNumbers);//runs bubble sort method 
			
			endTime = System.nanoTime();
			totalTime = endTime - startTime;//calculates time it takes to sort the array
			
			
			for (int i=0; i<randomNumbers.length;i++)//prints out the sorted array
			{
				System.out.println(randomNumbers[i]);
			}
			BubbleSort.iterationAmount();//prints out number of iterations
			System.out.println("Time it took to sort: " + totalTime/1000000 + " milliseconds.");//print out time it took to sort the array
			break;
		
		
		case 2: //Insertion sort 
			startTime = System.nanoTime();
			
			InsertionSort.sort(randomNumbers);//runs insertion sort method
			
			endTime = System.nanoTime();
			totalTime = endTime - startTime;//calculates time it takes to sort the array
			
			
			for (int i=0; i<randomNumbers.length;i++)//prints out the sorted array
			{
				System.out.println(randomNumbers[i]);
			}
			InsertionSort.iterationAmount();//print out number of iterations
			System.out.println("Time it took to sort: " + totalTime/1000000 + " milliseconds.");//print out time it took to sort the array
			break;
		
		
		case 3://Selection sort
			startTime = System.nanoTime();
			
			SelectionSort.sort(randomNumbers);//runs selection sort method
			
			
			endTime = System.nanoTime();
			totalTime = endTime - startTime;//calculates time it takes to sort the array
			
			
			for (int i=0; i<randomNumbers.length;i++)//prints out the sorted array
			{
				System.out.println(randomNumbers[i]);
			}
			SelectionSort.iterationAmount();//print out number of iterations
			System.out.println("Time it took to sort: " + totalTime/1000000 + " milliseconds.");//print out time it took to sort the array
			break;
		
		
		case 4: //Merge sort
			startTime = System.nanoTime();
			int start = 0;
			int end = randomNumbers.length -1;
			
			MergeSort.sort(randomNumbers, start, end);//runs merge sort method
			
			endTime = System.nanoTime();
			totalTime = endTime - startTime;//calculates time it takes to sort the array
			
			
			for (int i=0; i<randomNumbers.length;i++)//prints out the sorted array
			{
				System.out.println(randomNumbers[i]);
			}
			MergeSort.iterationAmount();//print out number of iterations
			System.out.println("Time it took to sort: " + totalTime/1000000 + " milliseconds.");//print out time it took to sort the array

			break;
		
			
		case 5://Quick sort
			startTime = System.nanoTime();
			int startQuick = 0;
			int endQuick = randomNumbers.length -1;
			
			QuickSort.sort(randomNumbers, startQuick, endQuick);//runs quick sort method
			
			endTime = System.nanoTime();
			totalTime = endTime - startTime;//calculates time it takes to sort the array
			
			
			
			for (int i=0; i<randomNumbers.length;i++)//prints out the sorted array
			{
				System.out.println(randomNumbers[i]);
			}
			QuickSort.iterationAmount();//print out number of iterations
			System.out.println("Time it took to sort: " + totalTime/1000000 + " milliseconds.");//print out time it took to sort the array
			
			break;
		}
		
		
	}

}
