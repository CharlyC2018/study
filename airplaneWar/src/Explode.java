package src;

import java.awt.*;

//±¨’®¿‡
public class Explode {
	int x, y;
	static Image[] imgs = new Image[16];

	static {
		for (int i = 0; i < 16; i++) {
			imgs[i] = GameUtil.getImage("explode/e" + (i + 1) + ".gif");
			// ∑¿¿¡º”‘ÿ
			imgs[i].getWidth(null);
		}
	}

	int count;
	boolean live = true;

	public void draw(Graphics g) {
		if (!live) {
			return;
		}
		if (count < 16) {
			g.drawImage(imgs[count], x, y, null);
			count++;
		} else {
			live = false;
		}
	}

	public Explode(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}