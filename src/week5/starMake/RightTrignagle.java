package week5.starMake;

import java.util.Scanner;

public class RightTrignagle {
    public void right(int num){
        for(int i = 0; i<=num;i++){
            for(int j = 0; j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RightTrignagle rightTrignagle = new RightTrignagle();
        int num = sc.nextInt();
        rightTrignagle.right(num);

    }
}
