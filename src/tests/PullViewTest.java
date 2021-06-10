package tests;

import javax.swing.JFrame;
import common.Team;
import views.PullView;

public class PullViewTest 
{

	public static void main(String[] args) 
	{
		PullView pull = new PullView();
		pull.setSize(32, 32);
		pull.setPull(Team.Black);
		JFrame window = new JFrame();
		window.setSize(800, 800);
		window.setLayout(null);
		window.setVisible(true);
		window.add(pull);
	}

}
