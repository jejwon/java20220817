package ch18.lecture.p01inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04InputStream {
	public static void main(String[] args) throws IOException {
		String path= "src/ch18/lecture/p01inputStream/C04InputStream.java";
		FileInputStream fis = new FileInputStream(path);
		
		byte[] buffer = new byte[10];
		
		int cnt = 0;
		
		while(fis.read(buffer) != -1) {
			cnt++;
		}
		
		System.out.println(cnt + "번 읽음");
		
		fis.close();
	}
}
