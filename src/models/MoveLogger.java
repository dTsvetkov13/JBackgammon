package models;

import interfaces.IMoveLogger;
import interfaces.IStack;
import structures.Stack;

public class MoveLogger implements IMoveLogger 
{
	private IStack<Log> undo;
	private IStack<Log> redo;
	
	public MoveLogger()
	{
		undo = new Stack<Log>();
		redo = new Stack<Log>();
	}
	
	@Override
	public void onEvent(Event event) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void logMove(Position from, Position to) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void undo() 
	{
		
	}
	
	@Override
	public void redo() 
	{
		
	}

}
