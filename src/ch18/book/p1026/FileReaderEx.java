package ch18.book.p1026;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("src/ch18/lecture/p04reader/C03Reader.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}
