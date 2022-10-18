package week5.starMake;

public class SquareStar {

    public void printSquareMatrix(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {

        SquareStar squareStar = new SquareStar();
        squareStar.printSquareMatrix(4);

    }
}
