package src;

import java.awt.Graphics;
import java.awt.Image;

public class Plane extends GameObject {

	public Plane(Image img, int x, int y, int speed) {
		super(img, x, y, speed);
	}

	@Override
	public void drawMyself(Graphics g) {
		super.drawMyself(g);
		 x += speed;
//		if (x > Constant.GAME_WIDTH) {
//			x -= speed;
//		}
//		if (x <= 0) {
//			x += speed;
//		}
	}
}