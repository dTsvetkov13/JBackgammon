package models;

import java.util.Random;

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
		Random rand = new Random();
		int firstNumber = 1 + rand.nextInt(6);
		int secondNumber = 1 + rand.nextInt(6);
		
		return new Pair<Integer, Integer> (firstNumber, secondNumber);
	}
}
