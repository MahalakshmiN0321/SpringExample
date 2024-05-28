package App15;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception{
        city_state_collection cityStateCollection=new city_state_collection();
        StandardEvaluationContext context=new StandardEvaluationContext(cityStateCollection);
        ExpressionParser expressionParser=new SpelExpressionParser();
        Expression expression=expressionParser.parseExpression("list.?[state == 'TamilNadu']");
        ArrayList<city_state> list= (ArrayList<city_state>) expression.getValue(context);
        System.out.println(list);
    }
}
