package event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
	Frame frame = new Frame();
	TextField textArea = new TextField(30);
	Button button = new Button("È·¶¨");
	
	private class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			textArea.setText("hello world");
		}
	}
	
	/*
	 * private class Mylistener2 implements ActionListener {
	 * 
	 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
	 * method stub
	 * 
	 * } }
	 */
	
	public void init() {
		MyListener myListener = new MyListener();
		button.addActionListener(myListener);
		
		frame.add(textArea,BorderLayout.NORTH);
		frame.add(button);

		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventDemo().init();
	}
}
