package day3;

import java.io.BufferedReader;
import java.io.File;
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
        System.out.println(readFile.readNByte(wordNum, "a_file.txt"));
        System.out.println(readFile.readOneByte("a_file.txt"));
        System.out.println(readFile.readTwoByte("a_file.txt"));
        readFile.fileList();
    }

    public String readNByte(int wordNum, String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        String str = "";
        for (int i = 0; i < wordNum; i++) {
            str = str + (char) br.read();
        }

        return str;
    }

    public char readOneByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        return (char) br.read();
    }

    public String readTwoByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        String str = "";
        for (int i = 0; i < 2; i++) {
            str = str + (char) br.read();
        }
        return str;
    }

    public void fileList() {
        File dir = new File("./");
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }

}

/*
out put:
몇 글자 읽으실래요?:
3
hel
h
he
-------
./out
./java_exercise1005.iml
./README.md
./.gitignore
./.git
./a_file.txt
./.idea
./src   */
