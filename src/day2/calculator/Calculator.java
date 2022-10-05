package day2.calculator;

public class Calculator {
    int num;
    NumberGenerator numberGenerator;
    int ranNum;

    public Calculator(int num, NumberGenerator numberGenerator){
        this.num = num;
        this.numberGenerator = numberGenerator;
        this.ranNum = numberGenerator.generate();
    }

    public void plus(){
        System.out.println(num+ranNum);
    }
    public void minus(){
        System.out.println(num-ranNum);
    }
    public void multiple(){
        System.out.println(num*ranNum);
    }
    public void divide(){
        try{
            float result = num/ranNum;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.printf("랜덤 한 수가 0");
        }
    }
}
