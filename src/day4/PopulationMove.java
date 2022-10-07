package day4;

public class PopulationMove {
    private int fromSido;
    private int toSido;

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
                "fromSido=" + fromSido +
                ", toSido=" + toSido +
                '}';
    }
}
