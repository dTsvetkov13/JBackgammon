package models;

import interfaces.IBoard;
import listeners.IEventListener;

public class Board implements IBoard, IEventListener
{

	@Override
	public void onEvent(Event event)
	{
		switch(event.type)
		{
			default:
				break;
		}
	}
	
}
