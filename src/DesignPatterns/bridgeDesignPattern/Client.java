package DesignPatterns.bridgeDesignPattern;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle(5, 2, 3, new PenDrawingAPI());
        circle.draw();

        // Using a Pencil to draw a Square
        Shape square = new Square(4, 0, 0, new PencilDrawingAPI());
        square.draw();
    }
}
