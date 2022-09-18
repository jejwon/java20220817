package ch15.lecture.p04sortedSet;

import java.util.TreeSet;

public class C06Comparable {
	public static void main(String[] args) {
		
		TreeSet<Computer> coms = new TreeSet<>();
		
		coms.add(new Computer(3, 2));
		coms.add(new Computer(3, 4));
		coms.add(new Computer(7, 2));
		
		System.out.println(coms);
	}
}


class Computer implements Comparable<Computer>{ //natural ordering
	private int cpu;
	private int ram;
	public Computer(int cpu, int ram) {
		super();
		this.cpu = cpu;
		this.ram = ram;
	}
	public int getCpu() {
		return cpu;
	}
	public int getRam() {
		return ram;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + "]";
	}
	@Override
	public int compareTo(Computer o) {
		
		int cpuDiff = this.cpu - o.cpu;
		if (cpuDiff == 0) {
			return this.ram - o.ram;
		}
		return cpuDiff;
	}
	
	
	
}


