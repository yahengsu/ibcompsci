package reverseLinkedList;

import java.util.LinkedList;

public class LinkedLists {

	public static void reverse(LinkedList<String> staff)//reverse method
	{
		int size = staff.size();//gets the size of the LinkedList
		for(int i=0; i<size; i++)//for loop to account for all the elements in the LinkedList
		{
			String temp = staff.get(size-i-1);//gets the first element in the list and stores it temporarily
			staff.remove(temp);//removes the element so the size of the LinkedList remains the same
			staff.addLast(temp);;//adds the element at the back, reversing the list at the end of the for loop
		}
	}
}
