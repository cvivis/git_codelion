package codeUp;

import java.util.Scanner;

public class p1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        for(String s : ss.split("")){
            System.out.println("'"+s + "'");
        }
    }
}
