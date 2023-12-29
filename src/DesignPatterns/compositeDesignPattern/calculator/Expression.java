package DesignPatterns.compositeDesignPattern.calculator;

public class Expression implements ArithematicExpression{

    ArithematicExpression leftExpression;
    ArithematicExpression rightExpression;
    Operation operation;

    public Expression(ArithematicExpression leftExpression,ArithematicExpression rightExpression,Operation operation){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value =0;
        String expressionString="";
        switch (operation){
            case ADD:
                //expressionString +=leftExpression.evaluate()+ "+"+ rightExpression.evaluate();
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
              //  expressionString +=leftExpression.evaluate()+ "-"+ rightExpression.evaluate();
                value =  leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case MULTIPLY:
               // expressionString+=leftExpression.evaluate()+ "*"+ rightExpression.evaluate();
                value =  leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case DIVISION:
              //  expressionString+=leftExpression.evaluate()+ "/"+rightExpression.evaluate();
                value =  leftExpression.evaluate() / rightExpression.evaluate();
                break;
        }
        System.out.println("Expression value is :"+value);
     //   System.out.println(expressionString+"="+value);
        return value;
    }
}
