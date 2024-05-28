package App10;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import javax.swing.text.html.parser.Parser;

public class Test123 {
    public static void main(String[] args) {
        ExpressionParser expressionParser=new SpelExpressionParser();
        Expression expression= expressionParser.parseExpression("10+20");
        System.out.println(expression.getValue());
    }
}
