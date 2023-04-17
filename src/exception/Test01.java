package exception;

import java.io.*;

public class Test01 {
	public static void main(String[] args) {
		FileReader reader = null;

		try {
			reader = new FileReader("e:/a.txt");
			char c1 = (char) reader.read();
			char c2 = (char) reader.read();
			char c3 = (char) reader.read();
			System.out.println("" + c1 + c2 + c3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}