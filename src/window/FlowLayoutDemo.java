package window;

import java.awt.*;

public class FlowLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame frame = new Frame("this is a FlowLayoutDemo");
		
		frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		
		for (int i = 1; i <= 100; i++) {
			frame.add(new Button("Button" + i));
		}
		
		frame.pack();
		
		frame.setVisible(true);
		
	}
}