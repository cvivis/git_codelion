package codeUp;

import java.util.Scanner;

public class p1027 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split("\\.");
        System.out.printf("%02d-%02d-%04d",Integer.parseInt(ss[2]),Integer.parseInt(ss[1]),Integer.parseInt(ss[0]));

    }
}
