package graphicTrastj;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Hero {
	//comment
	//new comment
	// hello 
	//today is nice
   //hi
	BufferedImage sprite;
	String name;

	int x;
	int y;
	
	public Hero(String name, String imageLocation, int locationx ,int locationy){
		this.name = name;
		int width= 100;
		int height =200;
		x= locationx;
		y=locationy;
		
	
		
		sprite = GraphicsUtilities.getScaledImageFromFile(this.getClass(),width,height,imageLocation);

		
	}
		
	
	public BufferedImage getImage(){
		return sprite;
	}
	public String getName(){
		return name;
	}
	
	public int getLocationx(){
		return x;
	}
	
	public int getLocationy(){
		return y;
	}


	public void moveUp() {
		y--;
	}


	public void moveRight() {
		x+=6;
		
	}


	public void moveLeft() {
		x--;
	}


	public void moveDown() {
		y++;
	}

		

}
