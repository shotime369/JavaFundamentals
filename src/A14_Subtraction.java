public class A14_Subtraction extends A14_Operator {
public A14_Subtraction() {
    super ("-");
}

@Override
    public double operate(double operand1, double operand2) {
    return operand1 - operand2;
}

}


