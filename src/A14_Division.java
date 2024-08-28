public class A14_Division extends A14_Operator {
    public A14_Division() {
        super ("/");
    }

    @Override
    public double operate(double operand1, double operand2) {
        return operand1 / operand2;
    }

}
