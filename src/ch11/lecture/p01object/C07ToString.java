package ch11.lecture.p01object;

public class C07ToString {
	public static void main(String[] args) {
		Computer a = new Computer("lg", 32, 4);
		Computer b = new Computer("ss", 63, 8);
		
		
		System.out.println(a.toString()); 
		System.out.println(b.toString());
		
		
		System.out.println(String.valueOf(b));
		System.out.println(b);
		
	}
}


class Computer{
	private String model;
	private int ssd;
	private int ram;
	
	
	
	
	public Computer(String model, int ssd, int ram) {
		super();
		this.model = model;
		this.ssd = ssd;
		this.ram = ram;
	}




	@Override
	public String toString() {
		return "Computer [model=" + model + ", ssd=" + ssd + ", ram=" + ram + "]";
	}
	
	
	
	
	
	
}