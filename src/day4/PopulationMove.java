package day4;

import java.util.HashMap;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    HashMap<Integer,String> adm_code = new HashMap<>();

    PopulationMove(int fromSido , int toSido){
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }




    @Override
    public String toString() {
            return "PopulationMove{" +
                    "fromSido=" + adm_code.get(fromSido) +
                    ", toSido=" + adm_code.get(toSido) +
                    '}';

    }

}
