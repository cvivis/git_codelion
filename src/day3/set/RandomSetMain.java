package day3.set;

import java.util.HashSet;

public class RandomSetMain {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<Integer>();
            HashSet<String> set = new HashSet<String>();

        RandomNumberGenerater randomNumberGenerater = new RandomNumberGenerater();
//        int r = 0;
//        for (int i = 0; i<50;i++){
//            r = randomNumberGenerater.generate(10);
//            System.out.println(r);
//            set.add(r);
//        }
//        System.out.println("set: "+set);

        for(int i = 0; i<50;i++){
            String r = randomNumberGenerater.generate();
            System.out.println(r);
            set.add(r);
        }
        System.out.println(set);
    }
}
