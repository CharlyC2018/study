package window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		FileDialog fDialog = new FileDialog(frame, "1", FileDialog.LOAD);
		FileDialog fDialog2 = new FileDialog(frame, "2", FileDialog.SAVE);
		Button button = new Button("´ò¿ª");
		Button button1 = new Button("±£´æ");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fDialog.setVisible(true);
				String directory = fDialog.getDirectory();
				String file = fDialog.getFile();
				System.out.println(directory);
				System.out.println(file);
			}
		});
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fDialog2.setVisible(true);
				String directory2 = fDialog2.getDirectory();
				String file2 = fDialog2.getFile();
				System.out.println(directory2);
				System.out.println(file2);
			}
		});

		frame.add(button,BorderLayout.NORTH);
		frame.add(button1);

		frame.pack();
		frame.setVisible(true);
	}

}
