package day3.set;

import java.util.Random;

public class RandomNumberGenerater implements NumberSetCreater{

    @Override
    public int generate(int num) {
        Random random = new Random();
        return random.nextInt(num);
    }
}

