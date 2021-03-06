package interpreter;

public class Context {

    private String nextOp = "";

    private double operator = 0;

    private double result = 0;

    public double getInteger(String in) 
    {
        if(in.toLowerCase().equals("cero"))
            return 0;
        else if(in.toLowerCase().equals("uno"))
            return 1;
        else if(in.toLowerCase().equals("dos"))
            return 2;
        else if(in.toLowerCase().equals("tres"))
            return 3;
        else if(in.toLowerCase().equals("cuatro"))
            return 4;
        else if(in.toLowerCase().equals("cinco"))
            return 5;
        else if(in.toLowerCase().equals("seis"))
            return 6;
        else if(in.toLowerCase().equals("siete"))
            return 7;
        else if(in.toLowerCase().equals("ocho"))
            return 8;
        else if(in.toLowerCase().equals("nueve"))
            return 9;
        else if(in.toLowerCase().equals("pi"))
            return Math.PI;
        else 
            return -1;
    }


    public void setOperator(double operator) {
        this.operator = operator;
    }

    public void setOperation(String operation) {
        if(operation.toLowerCase().equals("mas"))
            this.nextOp = "+";
        else if(operation.toLowerCase().equals("menos"))
            this.nextOp = "-";
    }

    public void calculate()
    {
        if(this.nextOp.toLowerCase().equals("") || this.nextOp.toLowerCase().equals("+") ) 
            this.result += operator;
        
        else if(this.nextOp.toLowerCase().equals("-"))
            this.result -= operator;
    }

    public double getResult()
    {
       return this.result;
    }


}