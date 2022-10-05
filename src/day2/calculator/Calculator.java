package day2.calculator;

public class Calculator {

    NumberGenerator numberGenerator;

    public Calculator(NumberGenerator numberGenerator){
        this.numberGenerator = numberGenerator;
    }

    public void plus(){
        System.out.println(numberGenerator.generate(2000));
    }
}
