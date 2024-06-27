package DesignPatterns.bridgeDesignPattern;

public class Square extends Shape{
    private int side;
    private int x;
    private int y;

    public Square(int side, int x, int y, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.side = side;
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        drawingAPI.drawSquare(side, x, y);
    }
}
