package day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PopulationStatistics {
    public void readChar(String fileName) throws  IOException{
        FileReader fileReader = new FileReader(fileName);
        char c = (char)fileReader.read();
        System.out.println(c);
    }
    public void readLine(String fileName) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String str;
        while((str = reader.readLine()) != null){
            System.out.println(str);
        }
        reader.close();
    }

    public void readLine2(String filrName) throws IOException{
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filrName), StandardCharsets.UTF_8)){
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            throw new RuntimeException();
        }
    }

    public void parse(String data){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(data), StandardCharsets.UTF_8)){
            String line;
            String[] lineSplit;
//            HashMap<Integer,Integer> popMove = new HashMap<>();
            ArrayList<PopulationMove> populationMoveArrayList = new ArrayList<>();
            while((line = br.readLine())!=null){
                 lineSplit = line.split(",");
                 PopulationMove populationMove = new PopulationMove(Integer.parseInt(lineSplit[0]),Integer.parseInt(lineSplit[6]));
                populationMoveArrayList.add(populationMove);

            }
            System.out.println(populationMoveArrayList.toString());
        }catch (IOException e){
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) throws IOException{
        String address = "/Users/admin/Documents/data/2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();


//        populationStatistics.readChar(address);
//        populationStatistics.readLine(address);
//        populationStatistics.readLine2(address);
        populationStatistics.parse(address);
    }
}
