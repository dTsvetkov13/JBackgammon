package models;

import java.util.LinkedList;

import interfaces.ICommand;
import interfaces.IMoveLogger;
import interfaces.IStack;
import structures.Stack;

public class MoveLogger implements IMoveLogger 
{
	private Stack<Log> undo;
	private Stack<Log> redo;
	
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
		undo.pop();
		//redo.push(data);
	}
	
	@Override
	public void redo() 
	{
		
	}

}
