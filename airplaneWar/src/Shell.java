package src;

import java.awt.*;

public class Shell extends GameObject {
	double degree;

	public Shell() {
		degree = Math.random() * Math.PI * 2;
		x = 200;
		y = 200;
		width = 10;
		height = 10;
		speed = 10;
	}

	@Override
	public void drawMyself(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.yellow);

		g.fillOval(x, y, width, height);

		// 炮弹沿着任意角度飞行
		x += speed * Math.cos(degree);
		y += speed * Math.sin(degree);

		// 实现边界碰撞回弹
		if (y > Constant.GAME_HEIGHT || y <= 30) {
			degree = -degree;
		}

		if (x > Constant.GAME_WIDTH-width || x <= 0) {
			degree = Math.PI - degree;
		}

		g.setColor(c);
	}
}
