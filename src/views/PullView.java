package views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import common.Team;
import models.Board;

public class PullView extends JPanel
{
	private Pull pull;
	private static String imagePath = " ";
	private static String whitePull = "../resources/whitePull.png";
	private static String blackPull = "../resources/blackPull.png";
	private BufferedImage image;
		
	public PullView()
	{
		
		
		URL resource = getClass().getResource(imagePath);
		try
		{
			image = ImageIO.read(PullView.class.getResourceAsStream(imagePath));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void setPull(Pull pull)
	{
		this.pull = pull;
		
		if(pull.team == Team.Black)
		{
			imagePath = blackPull;
		}
		else
		{
			imagePath = whitePull;
		}
	}
	
	public void setTeam(Team team)
	{
		
	}
	
	public void paintComponent(Graphics g)
	{
		/*
		super.paintComponent(g);
        System.out.println(imagePath.getWidth() + " " + imagePath.getHeight() + " "
        					+ imagePath.getMinX() + " " + imagePath.getMinY() + " " 
        					+ imagePath.getMinTileX() + " " + imagePath.getMinTileY());
        g.drawImage(imagePath, 0, 0, this);
        */
	}
}
