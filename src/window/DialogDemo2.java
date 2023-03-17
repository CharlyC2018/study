package window;

import java.awt.*;
import java.awt.event.*;

import javax.swing.Box;


public class DialogDemo2 {
	Frame frame = new Frame();
	Dialog d1 = new Dialog(frame,"模式对话框",true);
	Button b1 = new Button("打开模式对话框");
	TextField tf = new TextField(3);
	Button dButton = new Button("确认");
	
	public void Init() {
		d1.setBounds(20, 30, 200, 300);
		
		Box box = Box.createVerticalBox();
		
		//tf.add(null);
		
		box.add(tf);
		box.add(dButton);
		
		d1.add(box);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				d1.setVisible(true);
			}
		});
		
			
		frame.add(b1,BorderLayout.NORTH);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DialogDemo2().Init();
	}
}