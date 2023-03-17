package window;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("This is a BoxLayoutDemo2");
		//frame.setLayout(new BoxLayout(frame,BoxLayout.Y_AXIS));
		
		Box hBox = Box.createHorizontalBox();
		hBox.add(new Button("Button 1"));
		hBox.add(new Button("Button 2"));
		
		Box vBox = Box.createVerticalBox();
		vBox.add(new Button("Button 1"));
		vBox.add(new Button("Button 2"));
		
		frame.add(hBox,BorderLayout.NORTH);
		frame.add(vBox);
		
		frame.pack();
		frame.setVisible(true);	
	}
}