package ch18.lecture.p02outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01OutputStream {
	public static void main(String[] args) throws IOException {
		//OutputStream: 바이트 단위로 출력하는 스트림
		//주요 메소드: write
		
		String name = "C://Users//User//Desktop//output//output1.txt";
		OutputStream os = new FileOutputStream(name);
		
		//write(): 한바이트 출력 메소드
		os.write(0);
		os.write(127);
		os.write(-128);
		
		os.close();
	}
}
