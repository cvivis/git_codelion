package day2.calculator;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public int generate(int num) {
        return 2000 * num;
    }
}
