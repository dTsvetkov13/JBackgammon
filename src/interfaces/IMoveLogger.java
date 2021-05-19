package interfaces;

import listeners.IEventListener;
import models.Position;

public interface IMoveLogger extends IEventListener
{
	void logMove(Position from, Position to);
	void undo();
	void redo();
}
