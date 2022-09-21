package ch18.book.Ex.Ex7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddLineNumberEx {
	public static void main(String[] args) throws Exception {
		//정확한 경로로 수정하세요
		String filepath = "src/ch18/book/Ex/Ex7/AddLineNumberEx.java";
		FileReader fr = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		
		int num = 1;
		while((line = br.readLine()) != null) {
			System.out.println(num + ":" + line);
			num++;
		}
		
		fr.close();
		br.close();
	}
}
