package edu.iims.mcs.oops.week8.generic.wildcards;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}

public class UpperBoundedWildCard {

    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(new Rectangle());

        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle());
        circleList.add(new Circle());

        drawShapes(rectangleList);
        drawShapes(circleList);
    }

}
