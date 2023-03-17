package window;

import java.awt.*;

public class PanelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame frame = new Frame("这是一个PanelDemo");
		Panel p = new Panel();
		p.add(new TextField("This is test text"));
		p.add(new Button("test button"));
		
		frame.add(p);
		frame.setLocation(100, 100);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
}