package models;

import java.util.Random;

import common.EventType;
import listeners.IEventListener;
import listeners.ListenersManager;
import structures.Pair;

public class Dice implements IEventListener
{
	public Dice() {}
	
	@Override
	public void onEvent(Event event)
	{
		switch(event.type)
		{
		case ThrowDice:
		{
			ListenersManager.getInstance()
			.onEvent(new Event<Pair<Integer, Integer>>(EventType.DiceThrown, throwDice()));
			break;
		}
		default:
			break;
		}
	}
	
	private Pair<Integer, Integer> throwDice()
	{
		Random rand = new Random();
		int firstNumber = 1 + rand.nextInt(6);
		int secondNumber = 1 + rand.nextInt(6);
		
		return new Pair<Integer, Integer> (firstNumber, secondNumber);
	}
}
