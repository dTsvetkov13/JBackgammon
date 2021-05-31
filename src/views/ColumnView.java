package views;

import java.awt.Graphics;

import javax.swing.JPanel;

import structures.ArrayList;

public class ColumnView extends JPanel
{
	private ArrayList<PullView> pulls;
	
	public ColumnView()
	{
		pulls = new ArrayList<PullView>(0);
	}
	
	public void addPullView(PullView pullView)
	{
		if(pullView != null)
		{
			pulls.add(pullView);
		}
	}
	
	public PullView getLastPullView()
	{
		return pulls.get(pulls.size() - 1);
	}
	
	public void removePullView()
	{
		pulls.removeFrom(pulls.size() - 1);
	}
	
	public void paintComponent(Graphics g)
	{
		for(PullView pull : pulls)
		{
			pull.paintComponent(g);
		}
	}
}