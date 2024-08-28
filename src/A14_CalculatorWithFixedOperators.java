public class A14_CalculatorWithFixedOperators {

   public static void main(String[] args) {
       System.out.println("1 + 1 =" + new
               A14_CalculatorWithFixedOperators(1,1,"+").operate());
       System.out.println("4 - 2 =" + new
               A14_CalculatorWithFixedOperators(4,2,"-").operate());
       System.out.println("300 / 42 =" + new
               A14_CalculatorWithFixedOperators(300,42,"/").operate());
   }

   private final double operand1;
   private final double operand2;

   //the current operator
    private final A14_Operator operator;

    //all possible operations
    private final A14_Division division = new A14_Division();
    private final A14_Multiplication multiplication = new A14_Multiplication();
    private final A14_Subtraction subtraction = new A14_Subtraction();
    private final A14_Operator sum = new A14_Operator();

public A14_CalculatorWithFixedOperators(double operand1, double operand2, String operator) {
    this.operand1 = operand1;
    this.operand2 = operand2;

    if (subtraction.matches(operator)){
        this.operator = subtraction;
    } else if (division.matches(operator)){
        this.operator = division;
    } else if (multiplication.matches(operator)){
        this.operator = multiplication;
    } else {
        this.operator = sum;
    }
}

public double operate() {
    return operator.operate(operand1, operand2);
}

}
