package codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class p2081 {

    public int[] getMax(int[] arr){
        int max = 0;
        int index = 0;
        for(int i = 0; i < 9; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return new int[]{max,index+1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p2081 sortCheck = new p2081();
        int[] arr = new int[9];
        for(int i = 0; i <9;i++) {
            arr[i] = sc.nextInt();
        }
        int[] getMax = sortCheck.getMax(arr);
        System.out.println(getMax[0]);
        System.out.println(getMax[1]);

    }
}
