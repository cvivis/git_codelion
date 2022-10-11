package codeUp;

//2013.8.5

import java.util.Scanner;

public class p1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("\\.");

        System.out.printf("%04d.%02d.%02d",Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
    }
}
