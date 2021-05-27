package models;

import listeners.IEventListener;
import structures.Pair;

public class Dice implements IEventListener
{
	public Dice() {}
	
	@Override
	public void onEvent(Event event)
	{
		
	}
	
	private Pair<Integer, Integer> throwDice()
	{
		return null;
	}
}
