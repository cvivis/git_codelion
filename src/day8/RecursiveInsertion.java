package day8;

import java.util.Arrays;

public class RecursiveInsertion {


        public int[] sort(int[] arr,int len){

            if(len == arr.length)return arr;
            else{
//                int target = arr[len];;

                int j = len - 1;
                while(j>=0 && arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j] ;
                    arr[j] = temp;
                    j--;
                }
                System.out.println(Arrays.toString(arr));
                return sort(arr,len+1);
            }

//            for(int i = 1 ; i<arr.length;i++ ){
//                for(int j = i - 1; j>=0;j--){
//                    if(arr[j]>arr[j+1]){
//                        int temp = arr[j];
//                        arr[j] = arr[j+1];
//                        arr[j+1] = temp;
//                    }
//                }
//            }
        }
        public static void main(String[] args) {
            int[] arr = {8,5,6,2,4};
            RecursiveInsertion recursiveInsertion = new RecursiveInsertion();
            System.out.println(Arrays.toString(recursiveInsertion.sort(arr,1)));
        }
}
