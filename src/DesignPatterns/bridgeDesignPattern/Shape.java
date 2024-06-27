package DesignPatterns.bridgeDesignPattern;

public abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI){
        this.drawingAPI = drawingAPI;
    }
    abstract void draw();
}
