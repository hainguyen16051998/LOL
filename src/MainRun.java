import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeamAction teamAction1 = new TeamAction();
        TeamAction teamAction2 = new TeamAction();

        ArrayList<Team> SKT = new ArrayList<>();
        Team team1 = teamAction1.inputTeam(scanner);
        SKT.add(team1);

        ArrayList<Team> G2 = new ArrayList<>();
        Team team2 = teamAction2.inputTeam(scanner);
        G2.add(team2);

        SummonRift summonRift = new SummonRift(SKT, G2);


        System.out.println(summonRift.toString());
    }


}
