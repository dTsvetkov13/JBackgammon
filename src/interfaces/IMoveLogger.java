package interfaces;

import models.Position;

public interface IMoveLogger
{
	void logMove(Position from, Position to);
	void undo();
	void redo();
}
