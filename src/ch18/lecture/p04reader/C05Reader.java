package ch18.lecture.p04reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class C05Reader {
	public static void main(String[] args) throws Exception {
		//454개 문자로 작성된 파일
				String fileName = "src/ch18/lecture/p04reader/C03Reader.java";
				FileReader fr = new FileReader(fileName);
				
				char[] buf = new char[100];
				int len = 0;
				int cnt = 0;
				
				
				while((len = fr.read(buf)) != -1) {
					cnt++;
				}
				System.out.println(cnt + "번 읽음");
				
				fr.close();
	}
}
