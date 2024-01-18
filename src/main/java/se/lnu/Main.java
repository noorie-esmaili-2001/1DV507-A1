package se.lnu;

import se.lnu.Exercise1.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle(Shapes.RECTANGLE, 2, 3));
        shapes.add(new Rectangle(Shapes.RECTANGLE, 3, 4));
        shapes.add(new Square(Shapes.SQUARE, 3)); // side=3
        shapes.add(new Square(Shapes.SQUARE, 5));
        shapes.add(new Circle(Shapes.CIRCLE, 1)); // radius=1
        shapes.add(new Circle(Shapes.CIRCLE, 2));

        for (Shape s : shapes)
            System.out.println(s);
    }
}