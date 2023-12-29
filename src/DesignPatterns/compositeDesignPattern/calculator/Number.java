package DesignPatterns.compositeDesignPattern.calculator;

public class Number implements ArithematicExpression{
    int number;

    public Number(int number){
        this.number = number;
    }
    @Override
    public int evaluate() {
        return number;
    }
}
