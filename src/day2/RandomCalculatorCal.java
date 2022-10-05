package day2;

import java.util.Random;

public interface RandomCalculatorCal {
    Random random = new Random();
    int ran = random.nextInt(10);
    public abstract void cal(int num);
}

class Plus implements RandomCalculatorCal{
    @Override
    public void cal(int num) {
        System.out.println(num + ran);
    }
}
class Minus implements RandomCalculatorCal{
    @Override
    public void cal(int num) {
        System.out.println(num - ran);
    }
}
class Multiple implements RandomCalculatorCal{
    @Override
    public void cal(int num) {
        System.out.println(num * ran);
    }
}
class Divide implements RandomCalculatorCal{
    @Override
    public void cal(int num) {
        if(num == 0){
            System.out.println("랜덤하게 생성된 숫자가 0입니다");
        }
        else{
            float divideNum = (float)num;
            System.out.println(divideNum + ran);
        }

    }
}




