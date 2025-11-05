package Modul5_soal1;

public class Rectangle extends Shape {
	private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
