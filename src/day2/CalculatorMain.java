package day2;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.plus(1,2));
        System.out.println(cal.minus(1,2));
        System.out.println(cal.multiple(1,2));
        System.out.println(cal.divide(1,2));
    }
}
