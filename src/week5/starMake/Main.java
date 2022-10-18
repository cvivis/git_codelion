package week5.starMake;

import java.util.Scanner;
public class Main{
    public void square(int num){
        //마름모 위에(가운데 포함)
        for (int i = 0; i <= num; i++) {
            for(int k = 0;k<num-i;k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //마름모 아래
        for (int l = num-1; l >0; l--) {
            for (int o = 1; o <= num - l; o++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * l - 1; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int num = sc.nextInt();
        main.square(num);
    }
}


