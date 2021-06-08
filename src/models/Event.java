package models;

import common.EventType;

public class Event<T>
{
	public EventType type;
	public T data;
	
	public Event(EventType type, T data) 
	{
		super();
		this.type = type;
		this.data = data;
	}
	
	public Event()
	{
		
	}
	
}
