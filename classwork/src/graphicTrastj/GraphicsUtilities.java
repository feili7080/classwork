package graphicTrastj;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class GraphicsUtilities {
	//can u pull out i cant
	//gets a scaled version of a image file
	public static BufferedImage getScaledImageFromFile(Class c, int width, int height, String fileName){
		BufferedImage sprite = new BufferedImage (width,height,BufferedImage.TYPE_INT_ARGB);
		URL url=c.getResource(fileName);
		try {
			BufferedImage original =ImageIO.read(url);
			Graphics2D g2 = (Graphics2D) sprite.getGraphics();
			g2.drawImage(original, 0, 0, width, height, 0, 0,original.getWidth(), original.getHeight(), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sprite;
	}
}
