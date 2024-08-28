public class A14_Operator {
    private final String operator;

    public A14_Operator(){
        this("+");
    }

    public A14_Operator(String operator){
        this.operator = operator;
    }

    public boolean matches (String toCheckFor){
        return this.operator.equals(toCheckFor);
    }

    public double operate(double operand1, double operand2){
            return operand1 + operand2;
        }


    }

