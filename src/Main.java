import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Command lines are mapped as,
        //args[0] = number of swimmer objects
        //args[1] = number of Spectator objects
        //args[2] = number of Judge objects
        //args[3] = number of Staff objects

        ArrayList<Swimmer> swimArr = new ArrayList<>();  //Array to store Swimmer objects
        ArrayList<Spectators> specArr = new ArrayList<>();  //Array to store Spectator objects
        ArrayList<Judge> judgeArr = new ArrayList<>();  //Array to store Judge objects
        ArrayList<Staff> staffArr = new ArrayList<>();  //Array to store Staff objects

        var score = new Scoreboard();  //Scoreboard object for set and get finish time
        score.setTime("00:00:00");

        for (int i = 0; i < 4 ; i++){
            for (int j = 1 ; j <= Integer.parseInt(args[i]); j++){
                switch (i) {
                    case 0 -> swimArr.add(new Swimmer(j, "Swimmer-" + j));
                    case 1 -> specArr.add(new Spectators(j, "Spectator-" + j));
                    case 2 -> judgeArr.add(new Judge(j, "Judge-" + j));
                    case 3 -> staffArr.add(new Staff(j, "Staff-" + j));
                }
            }
        }

        System.out.println("Swimming objects : " + swimArr);
        System.out.println("Spectator objects : " + specArr);
        System.out.println("Judge objects : " + judgeArr);
        System.out.println("SupportStaff objects : " + staffArr);

        System.out.println();
        System.out.println("Check swimming method.....");
        swimArr.get(0).swim();
        System.out.println("Checking checkScoreboard method.....");
        specArr.get(0).checkScoreboard(score);
        System.out.println("Checking blowWhistle method.....");
        judgeArr.get(0).blowWhistle();
        System.out.println("Checking checkScoreboard method.....");
        staffArr.get(0).checkScoreboard(score);
    }
}