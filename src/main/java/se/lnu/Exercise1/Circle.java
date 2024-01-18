package se.lnu.Exercise1;

public class Circle extends Shape {
    private double radius;

    public Circle(Shapes shape, double radius) {
        super(shape);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("The radius cannot be less than or equal to 0");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return getRadius() * 2 * Math.PI;
    }

}
