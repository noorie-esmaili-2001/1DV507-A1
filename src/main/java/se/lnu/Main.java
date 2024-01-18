package se.lnu;

import se.lnu.Exercise1.*;
import se.lnu.Exercise2.Stacks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(Shapes.RECTANGLE, 2, 3));
        shapes.add(new Rectangle(Shapes.RECTANGLE, 3, 4));
        shapes.add(new Square(Shapes.SQUARE, 3)); // side=3
        shapes.add(new Square(Shapes.SQUARE, 5));
        shapes.add(new Circle(Shapes.CIRCLE, 1)); // radius=1
        shapes.add(new Circle(Shapes.CIRCLE, 2));

        for (Shape s : shapes)
            System.out.println(s);

        Stacks stacks = new Stacks();
        if (stacks.isEmpty()) {
            System.out.println("Stack \"s1\" is Empty");
        }
        stacks.push("A");
        stacks.push("B");
        stacks.push("C");
        stacks.push("A");
        System.out.println("Stack \"s\" size is: " + stacks.size());
        System.out.println(stacks.pop() + " Popped from stack");
        System.out.println("Stack size after popping is: " + stacks.size());
        System.out.println(stacks.peek() + " Picked from stack");
        System.out.println("Stack size after peeking is: " + stacks.size());
    }
}