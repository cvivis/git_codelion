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

    public void RactangleMatrix(int n ,int m){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {

        SquareStar squareStar = new SquareStar();
        squareStar.printSquareMatrix(4);
        squareStar.RactangleMatrix(3,4);
    }
}
