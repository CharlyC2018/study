package src;

import java.awt.*;

public class GameObject {
	Image img;// ��Ӧ��ͼƬ
	double x, y;// ����
	int speed;// �����ƶ��ٶ�
	int width, height;// ����Ŀ�Ⱥ͸߶�

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

	// ���Լ�
	public void drawMyself(Graphics g) {
		g.drawImage(img, (int) x, (int) y, width, height, null);
	}

	// ���ظ������Ӧ�ľ���
	public Rectangle getRectangle() {
		return new Rectangle((int) x, (int) y, width, height);
	}
}