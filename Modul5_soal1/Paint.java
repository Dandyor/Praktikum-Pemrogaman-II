package Modul5_soal1;

public class Paint {
private double coverage;
	
	public Paint(double c) {
		coverage = c;
	}
	public double amount(Shape s) {
		System.out.println("computing amoung for " + s);
		return s.area()/coverage;
	}
}
