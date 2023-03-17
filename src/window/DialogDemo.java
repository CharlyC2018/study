package window;

import java.awt.*;
import java.awt.event.*;


public class DialogDemo {
	Frame frame = new Frame();
	Dialog d1 = new Dialog(frame,"模式对话框",true);
	Dialog d2 = new Dialog(frame,"非模式对话框",false);
	Button b1 = new Button("打开模式对话框");
	Button b2 = new Button("打开非模式对话框");
	
	public void Init() {
		d1.setBounds(20, 30, 200, 300);
		d2.setBounds(20, 30, 300, 200);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				d1.setVisible(true);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				d2.setVisible(true);
			}
		});
		
		frame.add(b1,BorderLayout.NORTH);
		frame.add(b2,BorderLayout.SOUTH);
		
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DialogDemo().Init();
	}
}