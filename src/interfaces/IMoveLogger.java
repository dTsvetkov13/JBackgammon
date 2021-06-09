package interfaces;

import listeners.IEventListener;
import models.Position;
import structures.Pair;

public interface IMoveLogger extends IEventListener
{
	void logMove(Position from, Position to, Pair<Integer, Integer> currentDice);
	void undo();
	void redo();
}
