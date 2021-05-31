package views;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import structures.ArrayList;

public class ColumnView extends JPanel
{
	private ArrayList<PullView> pulls;
	private boolean isSelected;
	
	public ColumnView()
	{
		isSelected = false;
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
		if(isSelected)
		{
			this.setBackground(Color.green);
		}
		else
		{
			this.setBackground(null);
		}
		for(PullView pull : pulls)
		{
			pull.paintComponent(g);
		}
	}
	
	public void setSelected(boolean value)
	{
		isSelected = value;
	}
}