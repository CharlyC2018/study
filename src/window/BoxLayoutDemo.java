package window;

import java.awt.*;

import javax.swing.BoxLayout;

public class BoxLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("This is a BoxLayoutDemo");
		frame.setSize(500,500);
		
		frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
		
		Button b1 = new Button("Button one");
		Button b2 = new Button("Button two");
		
		frame.add(b1);
		frame.add(b2);
		
		frame.pack();
		frame.setVisible(true);	
	}
}