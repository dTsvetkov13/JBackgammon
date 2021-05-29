package models;

import structures.Pair;

public class Log
{
	private Position from;
	private Position to;
	private Pair<Integer, Integer> currentDice;
	
	public Log()
	{
	}
	
	public Log(Position from, Position to, Pair<Integer, Integer> currentDice)
	{
		super();
		this.setFrom(from);
		this.setTo(to);
		this.setCurrentDice(currentDice);
	}

	public Position getFrom()
	{
		return from;
	}
	
	public Position getTo()
	{
		return to;
	}
	
	public Pair<Integer, Integer> getCurrentDice()
	{
		return currentDice;
	}
	
	public void setFrom(Position from)
	{
		this.from = from;
	}
	
	public void setTo(Position to)
	{
		this.to = to;
	}
	
	public void setCurrentDice(Pair<Integer, Integer> currentDice)
	{
		this.currentDice = currentDice;
	}
}
