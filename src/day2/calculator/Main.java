package day2.calculator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new SpeificNumberGenerator();
        Calculator calculator = new Calculator(10 , numberGenerator);
        Calculator calculator1 = new Calculator(10 , new RandomNumberGenerator());
        calculator.plus();
        calculator.minus();
        calculator.multiple();
        calculator.divide();

        calculator1.plus();
        calculator1.minus();
        calculator1.multiple();
        calculator1.divide();

    }
}
