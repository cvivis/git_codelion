package day7;

//1. no static method
//2. int 형 return , int arr 입력받는 sort()

public class Sort1 {

    public int sort(int[] arr){
        int temp = arr[0];
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length-i;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();
        int[] arr = new int[]{2,7,4,1,6,3,5};
        int num = sort1.sort(arr);
        System.out.println(num);
    }

}
