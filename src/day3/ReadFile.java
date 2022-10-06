package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 글자 읽으실래요?: ");
        int wordNum = sc.nextInt();
        System.out.println(readFile.readOneByte(wordNum,"a_file.txt"));
    }

    public String readOneByte(int wordNum, String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        String str = "";
        for(int i = 0; i<wordNum;i++){
            str = str + (char)br.read();
        }

        return str;
    }

}
