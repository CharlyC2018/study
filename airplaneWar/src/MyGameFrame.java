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
		System.out.println("���ڻ���"+count);
		count++;

		g.drawImage(bg, 0, 0, Constant.GAME_WIDTH, Constant.GAME_HEIGHT, null);
		plane.drawMyself(g);
	}

	public void launchFrame() {
		this.setTitle("�ɻ���ս");

		setVisible(true);
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		setLocation(200, 100);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// �������ڣ������߳�
		new PaintThread().start();
	}

	// �ڲ���
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
//		  Color old =g.getColor();//���������ɫ����Ҫ��¼֮ǰ����ɫ��ʹ���껭�ʺ�Ļ�ԭ������ɫ 
//		  g.setColor(Color.blue);
//		  g.drawLine(100, 50, 400, 400);
//		  g.drawRect(100, 50, 400, 400); 
//		  g.drawOval(100,50, 400, 400); 
//		  g.setColor(old); 
//		  }

	// �ػ��߳�

	private Image offScreenImage = null;

	// ˫��������Ļ��˸
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