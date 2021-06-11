package views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import common.EventType;
import listeners.ListenersManager;
import models.Event;

public class EndScreen extends JPanel
{
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	public static final int X_LENGTH = 40;
	public static final int Y_LENGTH = 80;
	public static final int BTN_WIDTH = 200;
	public static final int BTN_HEIGHT = 50;
	public static final int START_X = 280;
	public static final int START_Y = 40;
	
	private JButton btnBackToMenu;
	private JButton btnExit;
	
	public EndScreen()
	{
		Color brown = new Color(128, 96, 77);
		Color btnColor = new Color(227,188,154);
		
		this.setBounds(X_LENGTH, Y_LENGTH, WIDTH, HEIGHT);
		this.setLayout(null);
		this.setBackground(brown);
		
		btnBackToMenu = new JButton("Back to menu");
		btnBackToMenu.setBounds(START_X, START_Y, BTN_WIDTH, BTN_HEIGHT);
		btnBackToMenu.setBackground(btnColor);
		btnBackToMenu.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				ListenersManager.getInstance().onEvent(new Event<Object>(EventType.OpenMenu, null));
			}
			
		});
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(START_X, START_Y, BTN_WIDTH, BTN_HEIGHT);
		btnExit.setBackground(btnColor);
		btnBackToMenu.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
			
		});
		
		this.add(btnBackToMenu);
		this.add(btnExit);
	}
	
}
