package core;

import java.awt.Rectangle;

import javax.swing.JFrame;

import listeners.IEventListener;
import models.Board;
import models.Event;

public class Game implements IEventListener
{
	private Board board;
	private JFrame window;
	
	public Game()
	{
		board = new Board();
		window = new JFrame();
		window.setBounds(new Rectangle(100, 100, 1000, 1000));
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		board.setBounds(50, 50, 800, 800);
		window.add(board);
	}
	
	@Override
	public void onEvent(Event event)
	{
		
	}
}
