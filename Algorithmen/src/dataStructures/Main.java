package dataStructures;

public class Main {

	public static void main(String[]args)  {

		Stack<String> myStack = new Stack<>(4); 
		myStack.push("first Element").
		push("second Element").push("third Element").push("fourth Element");
//		while(!myStack.isEmpty()) {
//			System.out.println(myStack.pop().top());
//		}
		myStack.print();
	}
}
