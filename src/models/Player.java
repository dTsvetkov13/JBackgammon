package models;

import common.Team;

public class Player 
{
	public static final int STARTING_PULLS_COUNT = 15;
	
	private Team team;
	private int pullsToWin;
	
	public Player()
	{
		this(Team.Black);
	}
	
	public Player(Team team) 
	{
		super();
		this.team = team;
		pullsToWin = STARTING_PULLS_COUNT;
	}

	public Team getTeam() 
	{
		return team;
	}

	public void setTeam(Team team) 
	{
		this.team = team;
	}	
}
