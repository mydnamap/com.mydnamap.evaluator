import com.github.sidhant92.boolparser.application.BooleanExpressionEvaluator;
import com.github.sidhant92.boolparser.parser.canopy.PEGBoolExpressionParser;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Application {

    public static void main(String[] args){
        final PEGBoolExpressionParser booleanExpressionEvaluator = new PEGBoolExpressionParser();

        var  booleanOptional = booleanExpressionEvaluator.parseExpression("name.pepe : \"1234\"  AND  name.pepe1 = \"12\" OR p.p > 23");
    }
}
