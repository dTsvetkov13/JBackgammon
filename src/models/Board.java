package models;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import interfaces.IBoard;
import listeners.IEventListener;

public class Board extends JPanel implements IBoard, IEventListener
{
	private static double offsetFromBorderPersentage = 4.583333333333333;
	private static double columnWidthPersentage = 6.805555555555555;
	private static double pullDiameterPersentage = 4.166666666666667;
	
	
	private static String backgrandImagePath = "../resources/background.png";
	private BufferedImage background;
	
	public Board()
	{
		super();
		URL resource = getClass().getResource(backgrandImagePath);
		
		try
		{
			background = ImageIO.read(Board.class.getResourceAsStream(backgrandImagePath));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void onEvent(Event event)
	{
		switch(event.type)
		{
			default:
				break;
		}
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println(background.getWidth() + " " + background.getHeight() + " "
        					+ background.getMinX() + " " + background.getMinY() + " " 
        					+ background.getMinTileX() + " " + background.getMinTileY());
        g.drawImage(background, 0, 0, this);
    }
	
}
