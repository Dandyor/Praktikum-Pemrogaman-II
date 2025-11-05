package Modul5_soal1;

public abstract class Shape {
	protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    protected abstract double area();

    @Override
    public String toString() {
        return shapeName;
    }
}
