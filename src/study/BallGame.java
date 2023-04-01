package study;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class BallGame extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");

	double x = 200;
	double y = 200;
	double degree = 3.14 / 3; // ���ȣ�3.14=180�㣬 /3 ����60�㣻

	// boolean right = true;// ����С���ˮƽ�ƶ�����

	// ���ƴ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int) x, (int) y, null);

//		if (right) {
//			x += 10;
//		} else {
//			x -= 10;
//		}
//
//		if (x > 856 - 30 - 40) {
//			right = false;
//		}
//
//		if (x < 50) {
//			right = true;
//		}

		x = x + 10 * Math.cos(degree);
		y = y + 10 * Math.sin(degree);

		if (y > 501 - 40 - 30 || y < 40 + 40) {
			degree = -degree;
		}

		if (x > 856 - 40 - 30 || x < 40) {
			degree = 3.14 - degree;
		}
	}

	void launchFrame() {
		setSize(856, 501);
		setLocation(100, 100);
		setVisible(true);

		// ʵ�ֶ�����ÿ����ƶ���25��
		while (true) {
			repaint();

			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("�ҵ�С��Ϸ��ʼ��");

		BallGame game = new BallGame();
		game.launchFrame();
	}
}