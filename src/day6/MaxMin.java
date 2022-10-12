package day6;

interface Compare{
    boolean doSomething(int valueA,int valueB);
}


//interface와 callback을 이용해서 boolean 을 리턴하는 조건만 바꾼다.
public class MaxMin {

    private int getMaxorMin(int[] arr, Compare compare){// compare보내기가 콜백
        int target = arr[0];
        for(int i = 0; i < 9; i++){
            boolean isSth = compare.doSomething(arr[i],target);
            if(isSth){
                target = arr[i];
            }
        }
        return target;
    }

    public int max(int[] arr){
        return getMaxorMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }


    public int min(int[] arr){
        return getMaxorMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,29,30,12,57,74,70,85,61};
        MaxMin maxMin = new MaxMin();
        int maxvalue = maxMin.max(arr);
        System.out.println(maxvalue);
    }

}
