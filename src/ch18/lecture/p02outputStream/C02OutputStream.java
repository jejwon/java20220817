package ch18.lecture.p02outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C02OutputStream {
	public static void main(String[] args) throws IOException {
		String inputFile = "src/ch18/lecture/p02outputStream/C02OutputStream.java";
		String outputFile = "C://Users//User//Desktop//output//output2.txt";
		
		InputStream is = new FileInputStream(inputFile);
		OutputStream os = new FileOutputStream(outputFile);
		
		int read = 0;
		
		while((read = is.read()) != -1) {
			os.write(read);
		}
		
		is.close();
		os.close();
	}
}
