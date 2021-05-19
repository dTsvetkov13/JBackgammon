package listeners;

import models.Event;
import structures.ArrayList;

public class ListenersManager
{
	private static ListenersManager instance = null;
	private ArrayList<IEventListener> listeners;
	
	private ListenersManager()
	{
		listeners = new ArrayList<>();
	}
	
	public static ListenersManager etInstance()
	{
		if(instance == null)
		{
			instance = new ListenersManager();
		}
		return instance;
	}
	
	public void add(IEventListener listener)
	{
		listeners.add(listener);
	}
	
	public void remove(IEventListener listener)
	{
		listeners.remove(listener);
	}
	
	public void removeAt(int index)
	{
		listeners.removeFrom(index);
	}
	
	public void onEvent(Event event)
	{
		for(var listener : listeners)
		{
			listener.onEvent(event);
		}
	}
}
