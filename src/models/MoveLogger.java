package models;

import common.EventType;
import interfaces.IMoveLogger;
import interfaces.IStack;
import listeners.ListenersManager;
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
		switch(event.type)
		{
		case Undo:
		{
			undo();
		}
		case Redo:
		{
			redo();
		}
		case PullMoved:
		{
			//logMove();
		}
		default:
			break;
		}
	}

	@Override
	public void logMove(Position from, Position to) 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void undo() 
	{
		Log undoValue = undo.pop();
		redo.push(undoValue);
		ListenersManager.getInstance().onEvent(new Event<Log>(EventType.UndoPopped, undoValue));
	}
	
	@Override
	public void redo() 
	{
		Log redoValue = redo.pop();
		undo.push(redoValue);
		ListenersManager.getInstance().onEvent(new Event<Log>(EventType.RedoPopped, redoValue));
	}

}
