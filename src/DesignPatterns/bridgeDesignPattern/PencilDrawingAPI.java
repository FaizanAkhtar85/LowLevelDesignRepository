package DesignPatterns.bridgeDesignPattern;

public class PencilDrawingAPI implements DrawingAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle with radius " + radius + " using a pencil at (" + x + "," + y + ")");
    }

    @Override
    public void drawSquare(int side, int x, int y) {
        System.out.println("Drawing Square with side " + side + " using a pencil at (" + x + "," + y + ")");
    }
}
