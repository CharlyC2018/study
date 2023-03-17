package event;

import java.awt.*;
import java.awt.event.*;

import javax.swing.Box;

public class ListenerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		
		TextField textField = new TextField();
		Choice choice = new Choice();
		choice.add("ÁøÑÒ");
		choice.add("Êæä¿");
		choice.add("ãÆÄÝ");
		
		textField.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				// TODO Auto-generated method stub
				String item = textField.getText();
				System.out.println(item);
			}
		});
		
		choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				Object item = e.getItem();
				System.out.println(item);
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		Box box = Box.createHorizontalBox();
		box.add(choice);
		box.add(textField);
		frame.add(box);
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
