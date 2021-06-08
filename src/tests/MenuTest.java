package tests;

import javax.swing.JFrame;

import views.Menu;

public class MenuTest 
{

	public static void main(String[] args) 
	{
		JFrame window = new JFrame();
		Menu menu = new Menu();
		window.add(menu);
		window.setSize(800, 800);
		window.setLayout(null);
		window.setVisible(true);
		
	}

}
