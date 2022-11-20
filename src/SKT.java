import java.util.ArrayList;

public class SKT {
    private int ID;
    private ArrayList<Figure> figures;

    public SKT(int ID, ArrayList<Figure> figures) {
        this.ID = ID;
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "SKT{" +
                "ID=" + ID +
                ", figures=" + figures +
                '}';
    }
}
