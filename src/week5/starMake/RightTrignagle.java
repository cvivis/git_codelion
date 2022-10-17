package week5.starMake;

import java.util.Scanner;

public class RightTrignagle {
    private String letter;

    RightTrignagle(){

    }
    RightTrignagle(String letter){
        this.letter = letter;
    }

    public void right(int num){
        for(int i = 0; i<=num;i++){
            for(int j = 0; j<i;j++){
                System.out.print(letter);
            }
            System.out.println("\n");
        }
    }
    public void pyramid(int num){
        for (int i = 0; i <= num; i++) {
            for(int k = 0;k<num-i;k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(letter);
            }
            System.out.println("\n");
        }
    }
    public void square(int num){
        //마름모 위에(가운데 포함)
        for (int i = 0; i <= num; i++) {
            for(int k = 0;k<num-i;k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(letter);
            }
            System.out.println("\n");
        }
        //마름모 아래
        for (int l = num-1; l >=0; l--) {
            for (int o = 0; o < num - l; o++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * l - 1; m++) {
                System.out.print(letter);
            }


            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RightTrignagle rightTrignagle = new RightTrignagle("#");
        int num = sc.nextInt();
//        rightTrignagle.right(num);
//        rightTrignagle.pyramid(num);
        rightTrignagle.square(num);
    }
}
