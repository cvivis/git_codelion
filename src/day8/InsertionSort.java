package day8;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] arr){
        int temp = 1;
        int target = 0;
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
        int[] arr = {8,5,6,2,4};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.sort(arr)));
    }
}
