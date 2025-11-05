package Modul5_soal1;

public class Cylinder extends Shape {
	private Double radius;
    private Double height;

    public Cylinder(Double radius, Double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
