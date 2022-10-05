package day2;

public class Calculator {
    int num1;
    int num2;
    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int plus(){
        return this.num1 + this.num2;
    }
    public int minus(){
        return this.num1 - this.num2;
    }
    public int multiple(){
        return this.num1 * this.num2;
    }
    public float divide( ){
        return this.num1 / this.num2;
    }
}
