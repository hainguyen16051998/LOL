import java.util.Scanner;

public class FigureAction {
    public Figure inputFigure(Scanner scanner) {
        System.out.print("Mời bạn nhập ID tướng: ");
        Integer ID = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập tên tướng: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập vị trí: ");
        String position = scanner.nextLine();
        Figure figure = new Figure(ID, name, position);
        return figure;
    }
}
