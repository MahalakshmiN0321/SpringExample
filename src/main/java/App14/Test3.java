package App14;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test3 {
    public static void main(String[] args) {
        calbean c=new calbean();
        StandardEvaluationContext context=new StandardEvaluationContext(c);

        ExpressionParser expressionParser=new SpelExpressionParser();
        Expression expression=expressionParser.parseExpression("num1");
        expression.setValue(context,40);

        Expression expression1=expressionParser.parseExpression("num2");
        expression1.setValue(context,20);

        System.out.println(c.add());
        System.out.println(c.sub());
    }
}
