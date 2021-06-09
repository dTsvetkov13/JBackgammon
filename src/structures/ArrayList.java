package structures;

import java.util.Iterator;

import interfaces.IList;

public class ArrayList<T> implements IList<T>
{
	private int index;
	private Object[] data;
	
	public ArrayList() 
	{
		index = 0;
		data = new Object[index + 1];
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
		data[index++] = item;
		
		if(index == data.length)
		{
			Object[] temp = data;
			data = new Object[temp.length * 2];
			
			for(int i = 0; i < temp.length; i++)
			{
				data[i] = temp[i];
			}
		}
	}

	@Override
	public void insertAt(T item, int index)
	{
		if(this.index + 1 == data.length)
		{
			Object[] temp = data;
			data = new Object[temp.length * 2];
			
			for(int i = 0; i < temp.length; i++)
			{
				data[i] = temp[i];
			}
		}
		
		for(int i = this.index; i > index; i--)
		{
			data[i] = data[i - 1];
		}
		data[index] = item;
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
			data[i] = data[i + 1];
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
		return (T) data[index];
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
	public Iterator<T> iterator() 
	{
		return new MyIterator();
	}
	
	private int getIndexOfTheItem(T item)
	{
		for(int i = 0; i<this.index; i++)
		{
			if(data[i].equals(item))
				return i;
		}
			
		return -1;
	}
	
	private class MyIterator<T> implements Iterator<T>
	{
		private int current;

		@Override
		public boolean hasNext() {
			return current < size();
		}

		@Override
		public T next() {
			if (!hasNext()) 
			{
				throw new java.util.NoSuchElementException();
			}
            return (T) data[current++];
		}
		
	}
}
