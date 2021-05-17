package tests;

import structures.Stack;

public class StackTest 
{

	public static void main(String[] args) 
	{
		Stack stack = new Stack();
		stack.push(20);
		stack.push(30);
		stack.push(11);
		
		System.out.println("After push size of stack is: " + stack.size());
		System.out.println("Top item is: " + stack.peek());
		stack.pop();
		System.out.println("Stack size after pop is: " + stack.size());
		stack.clear();
		System.out.println("Stack size after clear is: " + stack.size());
	}

}
