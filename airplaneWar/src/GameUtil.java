package src;

import java.awt.*;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtil {

	

	// ������˽�У���ֹ�ⲿ��������
	private GameUtil() {
	}

	public static Image getImage(String path) {
		Image img = null;
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
}