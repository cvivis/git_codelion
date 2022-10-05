package day2.calculator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new SpeificNumberGenerator();
        Calculator calculator = new Calculator(numberGenerator);
        calculator.plus();;
    }
}
