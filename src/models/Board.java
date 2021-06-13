package models;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import interfaces.IBoard;
import views.ColumnView;

public class Board extends JPanel implements IBoard
{
	public static double offsetFromBorderPersentage = 4.583333333333333;
	public static double columnWidthPersentage = 6.805555555555555;
	public static double pullDiameterPersentage = 4.166666666666667;
	
	public static int boardColumns = 13; //Last one for bearing off
	public static int boardRows = 2;
	
	private static String backgrandImagePath = "../resources/background.png";
	private BufferedImage background;
	private ColumnView columns[][];
	
	public Board()
	{
		super();
		columns = new ColumnView[boardRows][boardColumns];
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
