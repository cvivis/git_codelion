package codeUp;

import java.util.Scanner;

public class p1620 {

    public static int sumNum(int n){
        int answer = 0;
        while(n>0){
            answer += n % 10;
            n = n / 10;
        }
//        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sumNum(n);;
        while(result >= 10){
            result = sumNum(result);
        }
        System.out.println(result);
    }
}
