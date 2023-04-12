package src;

import java.awt.*;

public class GameObject {
	Image img;// 对应的图片
	double x, y;// 坐标
	int speed;// 物体移动速度
	int width, height;// 物体的宽度和高度

	public GameObject() {
	}

	public GameObject(Image img, int x, int y, int speed) {
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;

		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}

	public GameObject(Image img, int x, int y, int speed, int width, int height) {
		this.img = img;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// 画自己
	public void drawMyself(Graphics g) {
		g.drawImage(img, (int) x, (int) y, width, height, null);
	}

	// 返回该物体对应的矩形
	public Rectangle getRectangle() {
		return new Rectangle((int) x, (int) y, width, height);
	}
}