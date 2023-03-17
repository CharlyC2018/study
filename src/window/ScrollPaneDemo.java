package window;

import java.awt.*;

public class ScrollPaneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("this is a ScrollPaneDemo");
		
		ScrollPane sPane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		sPane.add(new Button("this is a text test"));
		
		frame.add(sPane);
		
		frame.setBounds(100, 100, 500, 300);
		frame.setVisible(true);
	}
}