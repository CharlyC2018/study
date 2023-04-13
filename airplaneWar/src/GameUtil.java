package src;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


public class GameUtil {

	// 构造器私有，防止外部创建对象
	private GameUtil() {}

	public static Image getImage(String path) {
		BufferedImage img = null;
		URL url = GameUtil.class.getClassLoader().getResource(path);
		try {
			img = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}

	public static Image getImage1(String path) {
		Image img = Toolkit.getDefaultToolkit().getImage(path);
		return img;
	}
	
	 public static void main(String[] args) {
	        //Image img = GameUtil.getImage("/study/images/airplaneWar/plane.png");
	      //  Image bg = GameUtil.getImage("images/ball.png");
	       // System.out.println(img);
	       // System.out.println(bg);
	        
		 URL url = GameUtil.class.getResource("/images/plane.png");
		 System.out.println(url);
	    }
}