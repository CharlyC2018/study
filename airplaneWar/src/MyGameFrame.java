package src;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MyGameFrame extends Frame {

	Image plane1 = GameUtil.getImage1("images/airplaneWar/plane.png");
	Image bg = GameUtil.getImage1("images/airplaneWar/bg.jpg");

	static int count = 0;

	Plane plane = new Plane(plane1, 200, 200, 5);

	@Override
	public void paint(Graphics g) {
		System.out.println("窗口绘制"+count);
		count++;

		g.drawImage(bg, 0, 0, Constant.GAME_WIDTH, Constant.GAME_HEIGHT, null);
		plane.drawMyself(g);
	}

	public void launchFrame() {
		this.setTitle("飞机大战");

		setVisible(true);
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		setLocation(200, 100);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 启动窗口，绘制线程
		new PaintThread().start();
	}

	// 内部类
	class PaintThread extends Thread {
		@Override
		public void run() {
			while (true) {
				repaint();

				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

//	  @Override 
//	  public void paint(Graphics g) { 
//		  Color old =g.getColor();//画笔如果改色，需要记录之前的颜色，使用完画笔后改回原来的颜色 
//		  g.setColor(Color.blue);
//		  g.drawLine(100, 50, 400, 400);
//		  g.drawRect(100, 50, 400, 400); 
//		  g.drawOval(100,50, 400, 400); 
//		  g.setColor(old); 
//		  }

	// 重画线程

	private Image offScreenImage = null;

	// 双缓冲解决屏幕闪烁
	public void update(Graphics g) {
		if (offScreenImage == null) {
			offScreenImage = this.createImage(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		}

		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}

	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}