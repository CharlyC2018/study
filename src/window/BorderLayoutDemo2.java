package window;

import java.awt.*;

public class BorderLayoutDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Frame object
		Frame frame = new Frame();
		
		//ָ��Frame����Ĳ��ֹ�����ΪBorderLayout
		frame.setLayout(new BorderLayout(30,10));
		
		//��Frameָ�������ϱ��и����һ����ť���
		frame.add(new Button("North"),BorderLayout.NORTH);
		frame.add(new Button("South"),BorderLayout.SOUTH);
		//frame.add(new Button("Center"),BorderLayout.CENTER);
		
		Panel panel = new Panel();
		panel.add(new TextField("Test text"));
		panel.add(new Button("Center"));
		
		frame.add(panel);		
		
		//����FrameΪ��Ѵ�С
		frame.pack();
		//����Frame�ɼ�
		frame.setVisible(true);
		
		
		
	}

}
