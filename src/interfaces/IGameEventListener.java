package interfaces;

public interface IGameEventListener
{
	void throwDice();
	void annnouceDiceThrow();
	void announcePossiblePullDestionations();
	void selectPull();
	void selectPullDestionation();
	void announcePullMoved();
	void redo();
	void undo();
	void announceGameOver();
}
