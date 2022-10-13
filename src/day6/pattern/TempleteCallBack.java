package day6.pattern;

public class TempleteCallBack {
    //client
    public static void main(String[] args) {
        Guests guest = new Guests(); // Context 객체 생성
        guest.order(new Food() { // Strategy 객체를 주입한다!
            @Override
            public void pickFood() {
                System.out.println("생선요리 콜백이다!"); // 코드가 중복됨
            }
        });
        guest.order(new Food() {
            @Override
            public void pickFood() {
                System.out.println("과일요리 콜백이다!");
            }
        });
        guest.order(new Food() {
            @Override
            public void pickFood() {
                System.out.println("쌀요리 콜백이다!");
            }
        });
    }
}
