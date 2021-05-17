package structures;

import interfaces.IStack;
import models.Node;

public class Stack<T> implements IStack<T>
{
	private Node<T> top;
	private int size;
	
	public Stack()
	{
		top = null;
		size = 0;
	}
	@Override
	public boolean isEmpty() 
	{
		return top == null;
	}

	@Override
	public void push(T data) 
	{
		Node node = new Node(data, top);
		top = node;
		size++;
	}

	@Override
	public T pop() 
	{
		T data = null;
		if (isEmpty())
		{
			throw new IllegalArgumentException("The stack is empty.");
		}
		else
		{
			data = top.getData();
			Node temp = top;
			top = top.getNext();
			temp.setNext(null);
			size--;
		}
		return data;
	}

	@Override
	public T peek() 
	{
		T data = null;
		
		if (isEmpty())
		{
			throw new IllegalArgumentException("The stack is empty.");
		}
		else
		{
			data = top.getData();
		}
		
		return data;
	}

	@Override
	public void clear() 
	{
		while(!isEmpty())
		{
			pop();
		}
	}

	@Override
	public int size() 
	{
		return size;
	}
	
}
