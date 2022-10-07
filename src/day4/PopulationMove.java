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

    public void adm_codeMatch(){

        adm_code.put(11,"서울");
        adm_code.put(21,"부산");
        adm_code.put(22,"대구");
        adm_code.put(23,"인천");
        adm_code.put(24,"광주");
        adm_code.put(25,"대전");
        adm_code.put(26,"울산");
        adm_code.put(29,"세종");
        adm_code.put(31,"경기도");
        adm_code.put(32,"강원도");
        adm_code.put(33,"충청북도");
        adm_code.put(34,"충청남도");
        adm_code.put(35,"전라북도");
        adm_code.put(36,"전라남도");
        adm_code.put(37,"경상북도");
        adm_code.put(38,"경상남도");
        adm_code.put(39,"제주도");
    }


    @Override
    public String toString() {
        adm_codeMatch();
        return "PopulationMove{" +
                "fromSido=" + adm_code.get(fromSido) +
                ", toSido=" + adm_code.get(toSido) +
                '}';
    }

}
