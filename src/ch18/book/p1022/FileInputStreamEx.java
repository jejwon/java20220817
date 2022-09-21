package ch18.book.p1022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("src/ch18/book/p1022/FileInputStreamEx.java");
			
			int data;
			
			while((data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
