package window;

import java.awt.*;
import java.awt.event.*;


public class DialogDemo {
	Frame frame = new Frame();
	Dialog d1 = new Dialog(frame,"ģʽ�Ի���",true);
	Dialog d2 = new Dialog(frame,"��ģʽ�Ի���",false);
	Button b1 = new Button("��ģʽ�Ի���");
	Button b2 = new Button("�򿪷�ģʽ�Ի���");
	
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