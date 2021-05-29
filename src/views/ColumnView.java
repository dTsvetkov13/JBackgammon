package views;

import structures.Stack;

public class ColumnView
{
	private Stack<PullView> pulls;
	
	public ColumnView()
	{
		pulls = new Stack<PullView>();
	}
	
	public void addPullView(PullView pullView)
	{
		if(pullView != null)
		{
			pulls.push(pullView);
		}
	}
	
	public PullView getLastPullView()
	{
		return pulls.peek();
	}
	
	public void removePullView()
	{
		pulls.pop();
	}
}
