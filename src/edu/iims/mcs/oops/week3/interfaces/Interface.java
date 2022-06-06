package edu.iims.mcs.oops.week3.interfaces;

interface Drawable {
    public static final int a = 10;
    public abstract void draw();
}

class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class Square implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}

public class Interface {

    public static void main(String[] args) {
        Drawable drawable = new Circle();
        drawable.draw();
        drawable = new Square();
        drawable.draw();
    }
}
