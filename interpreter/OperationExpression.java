package interpreter;

public class OperationExpression implements Expression{
    private String operation;

    public OperationExpression(String token)
    {
        this.operation = token;
    }

    public void interpret(Context context) 
    {
        context.setOperation(this.operation);
    }
    
}
