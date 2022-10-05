package day2.calculator;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {

    Random random = new Random();
    int ranNum = random.nextInt(10);
    @Override
    public int generate() {
        return ranNum;
    }
}
