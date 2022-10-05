public class Test {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int temp = a;

        a = b;
        b = temp;
        System.out.printf("%d %d",a,b);
    }
}
