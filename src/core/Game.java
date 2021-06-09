package core;

import java.awt.CardLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;

import listeners.IEventListener;
import models.Board;
import models.Event;
import views.Menu;

public class Game implements IEventListener
{
	private Board board;
	private JFrame window;
	private Menu menu;
	private CardLayout layout;
	
	public Game()
	{
		window = new JFrame();
		window.setBounds(new Rectangle(100, 100, 1000, 1000));
		layout = new CardLayout();
		window.setLayout(layout);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		menu = new Menu();
		window.add(menu);
	}
	
	@Override
	public void onEvent(Event event)
	{
		switch(event.type)
		{
		case StartGame:
		{
			board = new Board();
			window.add(board);
			this.layout.previous(this.window.getContentPane());
			break;
		}
		default:
			break;
		}
	}
}
