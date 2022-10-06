package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


class FilePath{
//    String filepath;
//    FilePath(String filepath){
//        this.filepath = filepath;
//    }
}
public class ReadFile {
    String filepath;
    ReadFile(String filepath){
        this.filepath = filepath;
    }
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("./a_file.txt");
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 글자 읽으실래요?: ");
        int wordNum = sc.nextInt();
        System.out.println(readFile.readNByte(wordNum, readFile.filepath));
        System.out.println(readFile.readOneByte(readFile.filepath));
        System.out.println(readFile.readTwoByte(readFile.filepath));
        System.out.println("한 줄: "+readFile.readOneLine(readFile.filepath));
        System.out.println("두 줄: "+readFile.readNLine(2,readFile.filepath));
        readFile.readNLines(readFile.filepath);
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

    public String readOneLine(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        return br.readLine();
    }
    public String readNLine(int N , String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        String str = "";
        for (int i = 0; i < N; i++) {
            str = str + br.readLine();
        }
        return str;
    }
    public void readNLines(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        String str;
        while( (str = br.readLine())!= null){
            System.out.println(str);
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
