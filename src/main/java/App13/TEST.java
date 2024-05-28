package App13;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TEST {
    public static void main(String[] args) {
        ExpressionParser expressionParser=new SpelExpressionParser();

        Expression expression=expressionParser.parseExpression("10 * 10");
        System.out.println(expression.getValue());

        Expression expression1=expressionParser.parseExpression("true == true");
        System.out.println(expression1.getValue());

        Expression expression2=expressionParser.parseExpression("true == false");
        System.out.println(expression2.getValue());

        Expression expression3=expressionParser.parseExpression("10==20?true:false");
        System.out.println(expression3.getValue());

        Expression expression4=expressionParser.parseExpression("T(Thread).MAX_PRIORITY");
        System.out.println(expression4.getValue());

        Expression expression5=expressionParser.parseExpression("10==20");
        System.out.println(expression5.getValue());
    }
}
