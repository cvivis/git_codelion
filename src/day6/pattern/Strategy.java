package day6.pattern;

interface Food{
    public void pickFood();
}

class Fish implements Food{
    @Override
    public void pickFood() {
        System.out.println("생선요리");
    }
}

class Fruit implements Food{
    @Override
    public void pickFood() {
        System.out.println("과일요리");
    }
}

class Rice implements Food{
    @Override
    public void pickFood() {
        System.out.println("쌀요리");
    }
}

class Guests {
    //context
    public void order(Food food){
        System.out.println("주문합니다");
        food.pickFood();
        System.out.println("주문한 음식 먹습니다");
        System.out.println("---------------");
    }


}


public class Strategy {
    //client
    public static void main(String[] args) {
        Guests guest = new Guests(); // Context 객체 생성
        Rice rice = new Rice(); // Context가 사용할 객체 생성
        Fruit fruit = new Fruit();
        Fish fish = new Fish();
        guest.order(rice);
        guest.order(fruit);
        guest.order(fish);
    }
}
