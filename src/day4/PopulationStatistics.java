package day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {
    public void readChar(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        char c = (char) fileReader.read();
        System.out.println(c);
    }

    public void readLine(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }

    public void readLine2(String filrName) throws IOException {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filrName), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public ArrayList<PopulationMove> parse(String data) {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(data), StandardCharsets.UTF_8)) {
            String line;
            String[] lineSplit;
            ArrayList<PopulationMove> populationMoveArrayList = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                lineSplit = line.split(",");
                int fromSido = Integer.parseInt(lineSplit[0]);
                int toSido = Integer.parseInt(lineSplit[6]);

//                if(fromSido<40 && fromSido>11 && toSido < 40 && toSido>11) {
                PopulationMove populationMove = new PopulationMove(fromSido, toSido);
                populationMoveArrayList.add(populationMove);
//                }
            }
//            for (PopulationMove pm : populationMoveArrayList) {
//                System.out.println(pm.toString());
//            }
            return populationMoveArrayList;
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + " , " + populationMove.getToSido();
    }

    public void createAfile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(String str : strs){
                bufferedWriter.write(str);
            }
            System.out.println("Write 완료");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntmap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntmap.get(key) == null) {
                moveCntmap.put(key, 1);
            }
            moveCntmap.put(key, moveCntmap.get(key) + 1);
        }
        return moveCntmap;
    }
    public static void main(String[] args) throws IOException {
        String address = "/Users/admin/Documents/data/2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.parse(address);
        List<String> pmlWrite = new ArrayList<>(); // for Write
        populationStatistics.parse(address);
        for(PopulationMove pm : pml){
//            pmlWrite.add(populationStatistics.fromToString(pm)) ;
////            System.out.println(populationStatistics.fromToString(pm));
//            pm.toString();
        }
        Map<String,Integer> map = populationStatistics.getMoveCntMap(pml);
        for(String key : map.keySet()){
            String s = String.format("값:%s, 갯수:%d\n",key,map.get(key));
            pmlWrite.add(s);
//            System.out.printf("값:%s, 갯수:%d\n",key,map.get(key));
        }

//        populationStatistics.readChar(address);
//        populationStatistics.readLine(address);
//        populationStatistics.readLine2(address);
//            populationStatistics.createAfile("frome_to.txt");
        populationStatistics.write(pmlWrite,"SidoCount.txt");
    }
}
