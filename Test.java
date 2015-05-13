/**
 * Class Test - tests the Java CW3 classes.
 * 
 * @author Daryl Smith, MSc IT 
 * @version 1
 */


public class Test 
{
	
	
	public static void main(String[] args) 
	{
		testArrayList();
		testLinkedList();
		testFunctionalArrayList();
		testFunctionalLinkedList();
		testSampleList();
		testStack();
		testImprovedStack();
	}
	
	public static void testArrayList() 
	{
		System.out.println("TESTING ARRAY LIST");
		
		ArrayList list = new ArrayList();
		System.out.println("New empty ArrayList looks like this:");
		list.printMe();
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new String("hello"));
		
		System.out.println("After adding 1,2,hello to array list using add():");
		list.printMe();
		
		list.add(1, new Integer(4));

		System.out.println("After adding 4 to index 1:");
		list.printMe(); // 1 4 2 hello
		
		
		list.remove(2);
		list.remove(0);
		list.remove(0);

		System.out.println("After removing index 2,0,0:");
		list.printMe();		
	}
	
	public static void testLinkedList() 
	{
		System.out.println("TESTING LINKED LIST");
		
		LinkedList list = new LinkedList();
		System.out.println("New empty LinkedList looks like this:");
		list.printMe();
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		System.out.println("After adding 1,2,3 to list using add():");
		list.printMe();
		
		list.add(1, new Integer(4));

		System.out.println("After adding 4 to index 1:");
		list.printMe(); // 1 4 2 3
				
		list.remove(2);
		list.remove(0);
		list.remove(0);

		System.out.println("After removing index 2,0,0:");
		list.printMe();
	}

	public static void testFunctionalArrayList() 
	{
		System.out.println("TESTING FUNCTIONAL ARRAY LIST");
		
		FunctionalArrayList list = new FunctionalArrayList();
		System.out.println("New empty FunctionalArrayList looks like this:");
		list.printMe();
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		System.out.println("After adding 1,2,3 to list using add(), printing the whole list:");
		list.printMe();
		//System.out.println(list);
		
		System.out.println("Printing out the head using list.head():");
		//ReturnObject head = list.head();
		System.out.println("head: " + list.head().getReturnValue());
		//System.out.println("head: " + head.getReturnValue());
		//list.printMe();
		//System.out.println(list);
		System.out.println("Printing out the head using printHead:");
		list.printHead();
		
		System.out.println("Printing the tail using list.rest():");
		FunctionalList tailList = list.rest();
		System.out.print("tail: ");
		for (int i = 0; i < tailList.size(); i++) 
		{
			System.out.print(tailList.get(i).getReturnValue() + " ");
		}
		System.out.println();
		System.out.println("Printing out the tail using printTail:");
		list.printTail();

		list.add(1, new Integer(4));

		System.out.println("After adding 4 at index 1:");
		System.out.println("Printing the whole list:");
		list.printMe(); // 1 4 2 3
		System.out.println("Printing out the head using list.head():");
		System.out.println("head: " + list.head().getReturnValue());
		System.out.println("Printing out the head using printHead:");
		list.printHead();
		System.out.println("Printing the tail using list.rest():");
		tailList = list.rest();
		System.out.print("tail: ");
		for (int i = 0; i < tailList.size(); i++) 
		{
			System.out.print(tailList.get(i).getReturnValue() + " ");
		}
		System.out.println();
		System.out.println("Printing out the tail using printTail:");
		list.printTail();
		
		
		list.remove(2);
		list.remove(0);
		list.remove(0);

		System.out.println("After removing index 2,0,0:");
		System.out.println("Printing the whole list:");
		list.printMe();
		System.out.println("Printing out the head using list.head():");
		System.out.println("head: " + list.head().getReturnValue());
		System.out.println("Printing out the head using printHead():");
		list.printHead();
		System.out.println("Printing the tail using list.rest():");
		tailList = list.rest();
		System.out.print("tail: ");
		for (int i = 0; i < tailList.size(); i++) 
		{
			System.out.print(tailList.get(i).getReturnValue() + " ");
		}
		System.out.println();
		System.out.println("Printing the tail using printTail:");
		list.printTail();
	}

	public static void testFunctionalLinkedList() 
	{
		System.out.println("TESTING FUNCTIONAL LINKED LIST");
		
		FunctionalLinkedList list = new FunctionalLinkedList();
		System.out.println("New empty FunctionalLinkedList looks like this:");
		list.printMe();
		
		list.add(new Integer(10));
		list.add(new Integer(12));
		list.add(new String("hello13"));
		
		System.out.println("After adding 10,12,hello13 to list using add(), printing the whole list:");
		list.printMe();
		//System.out.println(list);
		
		System.out.println("Printing out the head using list.head():");
		System.out.println(list.head().getReturnValue());
		System.out.println("Printing out the head using printHead():");
		list.printHead();
		
		System.out.println("Printing the tail using list.rest():");
		FunctionalList tailList = list.rest();
		System.out.print("tail: ");
		for (int i = 0; i < tailList.size(); i++) 
		{
			System.out.print(tailList.get(i).getReturnValue() + " ");
		}
		System.out.println();
		System.out.println("Printing the tail using printTail:");
		list.printTail();

		list.add(1, new Integer(4));

		System.out.println("After adding 4 at index 1:");
		System.out.println("Printing the whole list:");
		list.printMe(); // 10 4 12 hello13
		System.out.println("Printing out the head using list.head():");
		System.out.println(list.head().getReturnValue());
		System.out.println("Printing out the head using printHead():");
		list.printHead();
		System.out.println("Printing the tail using printTail:");
		list.printTail();
		
		list.remove(2);
		list.remove(0);
		list.remove(0);

		System.out.println("After removing index 2,0,0:");
		System.out.println("Printing the whole list:");
		list.printMe();
		System.out.println("Printing out the head using list.head():");
		System.out.println(list.head().getReturnValue());
		System.out.println("Printing out the head using printHead():");
		list.printHead();
		System.out.println("Printing the tail using list.rest():");
		tailList = list.rest();
		System.out.println("tail: ");
		for (int i = 0; i < tailList.size(); i++) 
		{
			System.out.print(tailList.get(i).getReturnValue() + " ");
		}
		System.out.println("Printing the tail using printTail():");
		list.printTail();
	}

	public static void testSampleList() 
	{
		System.out.println("TESTING SAMPLE LIST");
		
		SampleableListImpl list = new SampleableListImpl();
		System.out.println("New empty Sample list looks like this:");
		list.printMe();
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new String("string3"));
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new String("string6"));
		list.add(new Integer(7));
		list.add(new Integer(8));
		list.add(new String("string9"));
		list.add(new Integer(10));
		list.add(new Integer(11));
		list.add(new String("string12"));
		
		System.out.println("After adding 1,2,string3,4,5,string6,7,8,sring9,10,11,string12 to list using add(), printing the whole list:");
		list.printMe();
		
		System.out.println("Printing out the sample list:");
		SampleableList sampleList = list.sample();
		for (int i = 0; i < sampleList.size(); i++) 
		{
			System.out.print(sampleList.get(i).getReturnValue() + " ");
		}

		list.add(1, new Integer(4));

		System.out.println("After adding 4 at index 1:");
		System.out.println("Printing the whole list:");
		list.printMe();

		list.remove(2);
		list.remove(0);
		list.remove(0);

		System.out.println("After removing index 2,0,0:");
		System.out.println("Printing the whole list:");
		list.printMe();

		System.out.println("Printing out the revised sample list:");
		sampleList = list.sample();
		for (int i = 0; i < sampleList.size(); i++) 
		{
			System.out.print(sampleList.get(i).getReturnValue() + " ");
		}
		System.out.println();
	}

	public static void testStack() 
	{
		System.out.println("TESTING STACK");
		
		ArrayList list = new ArrayList();
		StackImpl myStack = new StackImpl(list);
		System.out.println("New empty Stack looks like this:");
		
		myStack.push(new Integer(1));
		myStack.push(new Integer(2));
		myStack.push(new String("string3"));
		myStack.push(new Integer(4));
		myStack.push(new Integer(5));
		myStack.push(new String("string6"));
		myStack.push(new Integer(7));
		myStack.push(new Integer(8));
		myStack.push(new String("string9"));
		myStack.push(new Integer(10));
		myStack.push(new Integer(11));
		myStack.push(new String("string12"));
		
		System.out.println("After adding 1,2,string3,4,5,string6,7,8,sring9,10,11,string12 to list using push(), printing the whole list:");
		myStack.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());
		
		myStack.push(new Integer(4));

		System.out.println("Print the whole stack, after pushing 4 to the stack:");
		myStack.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());

		myStack.pop();
		System.out.println("Print the whole stack, after popping the stack:");
		myStack.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());
		myStack.pop();
		System.out.println("Print the whole stack, after popping the stack:");
		list.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());
		myStack.pop();
		System.out.println("Print the whole stack, after popping the stack:");
		list.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());
	}

	public static void testImprovedStack() 
	{
		System.out.println("TESTING IMPROVED STACK");
		
		ArrayList list = new ArrayList();
		ImprovedStackImpl myStack = new ImprovedStackImpl(list);
		System.out.println("New empty Stack looks like this:");
		System.out.println("");
		myStack.push(new Integer(1));
		myStack.push(new Integer(2));
		myStack.push(new String("string3"));
		myStack.push(new Integer(4));
		myStack.push(new Integer(5));
		myStack.push(new String("string3"));
		myStack.push(new Integer(7));
		myStack.push(new Integer(8));
		myStack.push(new String("string3"));
		myStack.push(new Integer(10));
		myStack.push(new Integer(11));
		myStack.push(new String("string12"));
		
		System.out.println("After adding 1,2,string3,4,5,string6,7,8,sring9,10,11,string12 to list using push(), printing the whole list:");
		myStack.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());
		System.out.println("Reversing the stack: ");
		myStack.printReverse();
		
		myStack.push(new Integer(4));

		System.out.println("Print the whole stack, after pushing 4 to the stack:");
		myStack.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());
		System.out.println("Reversing the stack: ");
		myStack.printReverse();

		myStack.pop();
		System.out.println("Print the whole stack, after popping the stack:");
		myStack.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());
		myStack.pop();
		System.out.println("Print the whole stack, after popping the stack:");
		myStack.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());
		myStack.pop();
		System.out.println("Print the whole stack, after popping the stack:");
		myStack.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());
		System.out.println("Reversing the stack: ");
		myStack.printReverse();

		myStack.remove(new String("string3"));
		System.out.println("Print the whole stack, after removing string3 from the stack:");
		myStack.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());
		System.out.println("Reversing the stack: ");
		myStack.printReverse();
		
		myStack.remove(new Integer(4));
		System.out.println("Print the whole stack, after removing 4 from the stack:");
		myStack.printMe();
		System.out.print("Top of the stack: ");
		System.out.println(myStack.top().getReturnValue());
		System.out.println("Reversing the stack: ");
		myStack.printReverse();
	}
}