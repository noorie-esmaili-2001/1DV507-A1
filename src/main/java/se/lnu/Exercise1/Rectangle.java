package se.lnu.Exercise1;

public class Rectangle extends Shape {
    private double base;
    private double height;

    public Rectangle(Shapes shape, double base, double height) {
        super(shape);
        setBase(base);
        setHeight(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("Base cannot be less than or equal to 0");
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be less than or equal to 0");
        }
        this.height = height;
    }

    @Override
    public double getArea() {
        return getHeight() * getBase();
    }

    @Override
    public double getPerimeter() {
        return (getHeight() + getBase()) * 2;
    }


}
