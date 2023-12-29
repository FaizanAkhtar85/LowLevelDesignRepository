package DesignPatterns.compositeDesignPattern.calculator;

public class Main {
    public static void main(String[] args) {
        ArithematicExpression eight = new Number(8);
        ArithematicExpression five =new Number(5);
        ArithematicExpression nine = new Number(9);
        ArithematicExpression multiply =  new Expression(five,nine,Operation.MULTIPLY);
        ArithematicExpression parentExpression = new Expression(eight,multiply,Operation.ADD);
        parentExpression.evaluate();

    }
}
