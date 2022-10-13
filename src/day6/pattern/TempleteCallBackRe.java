package day6.pattern;


import java.sql.SQLOutput;

class GuestsRe{
    public void beforeOrder(String str){
        System.out.println("주문합니다");
        selectFood(str).pickFood();
        System.out.println("주문한 음식 먹습니다");
        System.out.println("---------------");
    }
    public Food selectFood(String foodName){
        return new Food(){
            @Override
            public void pickFood() {
                System.out.println("주문합니다");
                System.out.println(foodName + "요리 콜백이다!");
                System.out.println("주문한 음식 먹습니다");
                System.out.println("---------------");
            }
        };
    }
}



public class TempleteCallBackRe {
    //client
    public static void main(String[] args) {
        GuestsRe guest = new GuestsRe(); // Context 객체 생성
        guest.selectFood("쌀").pickFood();
        guest.selectFood("과일").pickFood();
        guest.selectFood("생선").pickFood();

    }
}
