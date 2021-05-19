package models;

import common.GlobalConstants;

public class Position
{	
	private int row;
	private int column;
	
	public Position()
	{
	}
	
	public Position(int row, int column)
	{
		this.setRow(row);
		this.setColumn(column);
	}

	public int getRow()
	{
		return row;
	}

	public int getColumn()
	{
		return column;
	}

	public void setRow(int row)
	{
		if(row <= 0)
		{
			throw new IllegalArgumentException(GlobalConstants.ErrorMessages.OUT_OF_RANGE);
		}
		this.row = row;
	}

	public void setColumn(int column)
	{
		if(column <= 0)
		{
			throw new IllegalArgumentException(GlobalConstants.ErrorMessages.OUT_OF_RANGE);
		}
		this.column = column;
	}
}
