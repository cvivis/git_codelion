package codeUp;

import java.util.Scanner;

public class p1443 {
    public int[] sort(int[] arr){
        int target;
        for(int i = 1 ; i<arr.length;i++ ){
            target = arr[i];
            int j = i - 1;
            while(j>=0 && target<arr[j]){
                arr[j+1] = arr[j] ;
                j--;
            }
            arr[j+1] = target;

        }

        return arr;
    }
    public static void main(String[] args) {
//        int[] arr = {8,5,6,2,4};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i <num; i++){
            arr[i] = sc.nextInt();
        }
        p1443 p1443 = new p1443();
        int[] result = p1443.sort(arr);
        for(int i = 0; i <num; i++){
            System.out.println(result[i]);
        }
    }
}