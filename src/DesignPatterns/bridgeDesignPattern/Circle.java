package DesignPatterns.bridgeDesignPattern;

public class Circle extends Shape{
    private int radius;
    private int x;
    private int y;

    public Circle(int radius, int x, int y, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        drawingAPI.drawCircle(radius, x, y);
    }
}
