package models;

public class Node<T>
{
	T data;
	Node next;

	public Node (T val, Node n) 
	{
		data = val;
		next = n;
	}

	public void setData (T val) 
	{
		data = val;
	}

	public T getData () 
	{
		return data;
	}

	public Node getNext () 
	{
		return next;
	}

	public void setNext (Node n) 
	{
		next = n;
	}
}
