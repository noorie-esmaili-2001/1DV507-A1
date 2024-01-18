package se.lnu.Exercise1;

public abstract class Shape {
    private Shapes shape;

    public Shape(Shapes shape) {
        setShape(shape);
    }


    public Shapes getShape() {
        return shape;
    }

    public void setShape(Shapes shape) {
        this.shape = shape;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return getShape().getName() + ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
