import java.util.ArrayList;

public class SummonRift {
    private ArrayList<Team> SKT;
    private ArrayList<Team> G2;

    public SummonRift(ArrayList<Team> SKT, ArrayList<Team> G2) {
        this.SKT = SKT;
        this.G2 = G2;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "SKT=" + SKT +
                ", G2=" + G2 +
                '}';
    }
}
