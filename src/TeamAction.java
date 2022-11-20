import java.util.ArrayList;
import java.util.Scanner;

public class TeamAction {
    public Team inputTeam(Scanner scanner) {
        FigureAction action = new FigureAction();
        System.out.print("Mời bạn nhập ID đội tuyển: ");
        Integer ID = Integer.parseInt(scanner.nextLine());
        ArrayList<Figure> top = new ArrayList<>();
        Figure figure1 = action.inputFigure(scanner);
        top.add(figure1);
        ArrayList<Figure> jungle = new ArrayList<>();
        Figure figure2 = action.inputFigure(scanner);
        jungle.add(figure2);
        ArrayList<Figure> mid = new ArrayList<>();
        Figure figure3 = action.inputFigure(scanner);
        mid.add(figure3);
        ArrayList<Figure> ad = new ArrayList<>();
        Figure figure4 = action.inputFigure(scanner);
        ad.add(figure4);
        ArrayList<Figure> sp = new ArrayList<>();
        Figure figure5 = action.inputFigure(scanner);
        sp.add(figure5);
        Team team = new Team(ID, top, jungle, mid, ad, sp);
        return team;
    }
}
