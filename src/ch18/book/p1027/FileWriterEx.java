package ch18.book.p1027;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx {
	public static void main(String[] args) throws Exception{
		File file = new File("C:\\Users\\user\\Desktop\\output\\output8.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("FileWriter는 한글로 된" + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
		
	}
}
