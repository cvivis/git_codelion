package codeUp;

import java.util.Scanner;

public class p1025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        System.out.printf("[%s0000]\n",ch[0]);
        System.out.printf("[%s000]\n",ch[1]);
        System.out.printf("[%s00]\n",ch[2]);
        System.out.printf("[%s0]\n",ch[3]);
        System.out.printf("[%s]\n",ch[4]);
    }
}
