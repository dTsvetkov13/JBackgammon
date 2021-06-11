package tests;

import javax.swing.JFrame;

import core.Game;
import listeners.ListenersManager;
import views.EndScreen;

public class EndScreenTest {

	public static void main(String[] args) 
	{
		Game game = new Game();
		ListenersManager.getInstance().add(game);
		JFrame frame = new JFrame();
		EndScreen endScreen = new EndScreen();
		frame.add(endScreen);
		frame.setSize(800, 800);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
