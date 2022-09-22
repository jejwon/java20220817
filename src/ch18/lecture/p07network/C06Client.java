package ch18.lecture.p07network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class C06Client {
	public static void main(String[] args) {
		String fileName = "";
		try(

				Socket socket = new Socket("172.30.1.60", 550000);
				
				FileInputStream fis = new FileInputStream(fileName);
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);)
		
		{
			
			byte[] buf = new byte[1000];
			int len = 0;
			while((len = bis.read(buf)) != -1) {
				bos.write(buf, 0, len); //buf에서 0번 인덱스부터 len까지
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
