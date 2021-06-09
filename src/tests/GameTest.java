package tests;

import core.Game;
import listeners.ListenersManager;

public class GameTest
{

	public static void main(String[] args)
	{
		Game game = new Game();
		ListenersManager.getInstance().add(game);
	}

}
