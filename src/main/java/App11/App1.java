package App11;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class App1 {
    public static void main(String[] args) {
        Calculate cal=new Calculate();
        StandardEvaluationContext context=new StandardEvaluationContext(cal);  //set the value to the property

        ExpressionParser expressionParser=new SpelExpressionParser();

        Expression expression1=expressionParser.parseExpression("num1");
        expression1.setValue(context,40);

        Expression expression2=expressionParser.parseExpression("num2");
        expression2.setValue(context,20);

        System.out.println("Addition:"+cal.add());
        System.out.println("Subtract:"+cal.sub());
        System.out.println("Multiply:"+cal.multiple());

    }
}
