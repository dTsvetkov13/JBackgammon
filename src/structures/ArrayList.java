package structures;

import java.util.Iterator;

import interfaces.IList;

public class ArrayList<T> implements IList<T>
{
	private int index;
	private Object[] list;
	
	public ArrayList(int size) 
	{
		index = 0;
		list = new Object[size];
	}
	
	@Override
	public boolean isEmpty()
	{
		return index <= 0;
	}

	@Override
	public boolean contains(T item)
	{
		return getIndexOfTheItem(item) != -1;
	}

	@Override
	public void add(T item)
	{
		list[index++] = item;
		
		if(index == list.length)
		{
			Object[] temp = list;
			list = new Object[temp.length * 2];
			
			for(int i = 0; i < temp.length; i++)
			{
				list[i] = temp[i];
			}
		}
	}

	@Override
	public void insertAt(T item, int index)
	{
		if(this.index + 1 == list.length)
		{
			Object[] temp = list;
			list = new Object[temp.length * 2];
			
			for(int i = 0; i < temp.length; i++)
			{
				list[i] = temp[i];
			}
		}
		
		for(int i = this.index; i > index; i--)
		{
			list[i] = list[i - 1];
		}
		list[index] = item;
	}

	@Override
	public void removeFrom(int index)
	{
		if(index < 0 || index >= this.index)
		{
			throw new IllegalArgumentException("This index doesn't exist");
		}
		
		for(int i = index; i < this.index - 1; i++)
		{
			list[i] = list[i + 1];
		}
	}

	@Override
	public void remove(T item)
	{
		int index = getIndexOfTheItem(item);
		if(index == -1)
		{
			return;
		}
		removeFrom(index);
	}

	@Override
	public T get(int index)
	{
		if(index < 0 || index >= this.index)
		{
			throw new IllegalArgumentException("Incorrect index");
		}
		return (T) list[index];
	}

	@Override
	public void clear()
	{
		index = 0;
	}

	@Override
	public int size()
	{
		return index;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private int getIndexOfTheItem(T item)
	{
		for(int i = 0; i<this.index; i++)
		{
			if(list[i].equals(item))
				return i;
		}
			
		return -1;
	}
}
