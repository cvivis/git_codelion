package day2;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator(1,2);

        System.out.println(cal.plus());
        System.out.println(cal.minus());
        System.out.println(cal.multiple());
        System.out.println(cal.divide());
    }
}
