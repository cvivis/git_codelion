package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        System.out.println(readFile.readOneByte("./a_file.txt"));
    }

    public char readOneByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        return (char)br.read();
    }

}
