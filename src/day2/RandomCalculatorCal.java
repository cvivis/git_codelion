package day2;

import java.util.Random;

public interface RandomCalculatorCal {
    public abstract void cal(int num);
}

class Plus implements RandomCalculatorCal{
    Random random = new Random();
    int ranNum = random.nextInt(10);
    @Override
    public void cal(int num) {
        System.out.println(num + ranNum);
    }
}
class Minus implements RandomCalculatorCal{
    Random random = new Random();
    int ranNum = random.nextInt(10);
    @Override
    public void cal(int num) {
        System.out.println(num - ranNum);
    }
}
class Multiple implements RandomCalculatorCal{
    Random random = new Random();
    int ranNum = random.nextInt(10);
    @Override
    public void cal(int num) {
        System.out.println(num * ranNum);
    }
}
class Divide implements RandomCalculatorCal{
    Random random = new Random();
    int ranNum = random.nextInt(10);
    @Override
    public void cal(int num) {
        if(num == 0){
            System.out.println("랜덤하게 생성된 숫자가 0입니다");
        }
        else{
            float divideNum = (float)num;
            System.out.println(divideNum + ranNum);
        }

    }
}


