package ch18.lecture.p01inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class C03InputStream {
	public static void main(String[] args) throws IOException {
		
		String path = "src/ch18/lecture/p01inputStream/C03InputStream.java";
		InputStream is = new FileInputStream(path);
		
		byte[] b = new byte[100];
		
		int len1 = is.read(b);
		int len2 = is.read(b);
		int len3 = is.read(b);
		
		System.out.println(len1);
		System.out.println(len2);
		System.out.println(len3);
		
		
		is.close();
		
	
	}
}
