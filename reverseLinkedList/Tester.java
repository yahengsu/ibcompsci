package reverseLinkedList;

import java.util.LinkedList;

public class Tester {
	public static void main(String args[])
	{
	 LinkedList<String> test = new LinkedList<String>();//new LinkedList
	 test.addLast("a");//elements are added to the LinkedList
	 test.addLast("b");
	 test.addLast("c");
	 test.addLast("d");
	 test.addLast("e");

	 System.out.println("Original List: " + test);//prints out the original list
	 LinkedLists.reverse(test);//reverses the elements
	 System.out.println("Reversed List: " + test);//prints out the reversed kust
	}
	
}
