import java.util.ArrayList;

public class Team {
    private int ID;
    private ArrayList<Figure> Top;
    private ArrayList<Figure> Jungle;
    private ArrayList<Figure> Mid;
    private ArrayList<Figure> Ad;
    private ArrayList<Figure> Sp;

    public Team(int ID, ArrayList<Figure> top, ArrayList<Figure> jungle, ArrayList<Figure> mid, ArrayList<Figure> ad, ArrayList<Figure> sp) {
        this.ID = ID;
        Top = top;
        Jungle = jungle;
        Mid = mid;
        Ad = ad;
        Sp = sp;
    }

    @Override
    public String toString() {
        return "Team{" +
                "ID=" + ID +
                ", Top=" + Top +
                ", Jungle=" + Jungle +
                ", Mid=" + Mid +
                ", Ad=" + Ad +
                ", Sp=" + Sp +
                '}';
    }
}
