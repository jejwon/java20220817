package ch12.book.p590;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i = 0; i < 2000; i++) {
			System.out.println(getName());
		}
	}
}
