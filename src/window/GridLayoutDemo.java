package window;

import java.awt.*;

public class GridLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("Counter");
		
		//Frame Ä¬ÈÏ¾ÍÊÇBorderLayout
		//frame.setLayout(new BorderLayout());
		
		frame.add(new TextField(),BorderLayout.NORTH);
		
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(3,5,4,4));
		
		for (int i = 0; i < 10; i++) {
			panel.add(new Button(i + ""));
		}
		
		panel.add(new Button("+"));
		panel.add(new Button("-"));
		panel.add(new Button("*"));
		panel.add(new Button("/"));
		panel.add(new Button("."));
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		
		
		
		
	}
}