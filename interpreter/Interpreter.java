package interpreter;

import java.util.ArrayList;

public class Interpreter {
    
    public static void main(String[] args){
        ArrayList<Expression> tree = new ArrayList();

        Context context = new Context();

        // Construye el arbol
        for (String token : args){
            if (context.getInteger(token) >= 0)
            {
                tree.add(new NumericExpression(token));
            }
            else{
                tree.add(new OperationExpression(token));
            }
        }

        for (Expression e: tree) {
            e.interpret(context);
        }

        System.out.println("El resultado de la interpretación es " + context.getResult());
    }
}
