public class A13_Calculator {

private final double operand1;
private final double operand2;
private final String operator;

    //constructor
    public A13_Calculator(double operand1, double operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public double operate(){
        if (this.operator.equals("-")) {
            return operand1 - operand2;
        } else if (this.operator.equals("+")) {
            return operand1 + operand2;
        } else if (this.operator.equals("x")) {
            return operand1 * operand2;
        } else if (this.operator.equals("/")) {
            return operand1 / operand2;
        } else if (this.operator.equals("%")) {
            return operand1 % operand2;
        } else { //if unknown return sum
            return operand1 + operand2;
        }
    }

    public static void main(String[] args) {
            System.out.println("1 + 1 = " + new A13_Calculator(1, 1, "+").
                    operate());
            System.out.println("4 - 2 = " + new A13_Calculator(4, 2, "-").
                    operate());
            System.out.println("1 x 2 = " + new A13_Calculator(1, 2, "x").
                    operate());
            System.out.println("10 / 2 = " + new A13_Calculator(10, 2, "/").
                    operate());
        System.out.println("10 % 2 = " + new A13_Calculator(10, 2, "%").
                operate());
    }
    }


