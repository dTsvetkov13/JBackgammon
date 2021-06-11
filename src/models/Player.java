package models;

import common.Team;

public class Player 
{
	private Team team;

	public Player()
	{
		this(Team.Black);
	}
	
	public Player(Team team) 
	{
		super();
		this.team = team;
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
