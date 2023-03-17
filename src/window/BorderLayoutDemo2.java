package window;

import java.awt.*;

public class BorderLayoutDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Frame object
		Frame frame = new Frame();
		
		//指定Frame对象的布局管理器为BorderLayout
		frame.setLayout(new BorderLayout(30,10));
		
		//往Frame指定东西南北中各添加一个按钮组件
		frame.add(new Button("North"),BorderLayout.NORTH);
		frame.add(new Button("South"),BorderLayout.SOUTH);
		//frame.add(new Button("Center"),BorderLayout.CENTER);
		
		Panel panel = new Panel();
		panel.add(new TextField("Test text"));
		panel.add(new Button("Center"));
		
		frame.add(panel);		
		
		//设置Frame为最佳大小
		frame.pack();
		//设置Frame可见
		frame.setVisible(true);
		
		
		
	}

}
