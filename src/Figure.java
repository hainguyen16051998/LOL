public class Figure {
    private int ID;
    private String name;
    private String position;

    public Figure(int ID, String name, String position) {
        this.ID = ID;
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
