package App12;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test1 {
    public static void main(String[] args) {

        ExpressionParser expressionParser=new SpelExpressionParser();

        Expression expression1=expressionParser.parseExpression("10+10");  //literals expression
        System.out.println(expression1.getValue());

        Expression expression2=expressionParser.parseExpression("'abc'+'def'");
        System.out.println(expression2.getValue());

        Expression expression3=expressionParser.parseExpression("'Spring' matches 'Sp.*'"); //Regular Expression
        System.out.println(expression3.getValue());

        Expression expression4=expressionParser.parseExpression("'maha@kavi' matches '[a-z]*@kavi'");
        System.out.println(expression4.getValue());

    }
}
