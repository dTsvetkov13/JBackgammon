package tests;

import javax.swing.JFrame;

import views.PullView;

public class PullViewTest {

	public static void main(String[] args) 
	{
		PullView pull = new PullView();
		JFrame window = new JFrame();
		window.add(pull);
		window.setSize(800, 800);
		window.setLayout(null);
		window.setVisible(true);

	}

}
