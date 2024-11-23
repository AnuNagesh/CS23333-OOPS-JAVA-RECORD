CODE-1:
  
Write a program to create interface called playable.
CODE:
import java.util.Scanner;

interface Playable {
    void play();
}

class Football implements Playable {
    private String name;

    public Football(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is Playing football");
    }
}

class Volleyball implements Playable {
    private String name;

    public Volleyball(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is Playing volleyball");
    }
}

class Basketball implements Playable {
    private String name;

    public Basketball(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is Playing basketball");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();
        Football footballPlayer = new Football(name1);
        Volleyball volleyballPlayer = new Volleyball(name2);
        Basketball basketballPlayer = new Basketball(name3);

        footballPlayer.play();
        volleyballPlayer.play();
        basketballPlayer.play();

        scanner.close();
    }
}

CODE-2:
  
Write a program to create interface for sports.
CODE:
import java.util.Scanner;

interface Sports {
    public void setHomeTeam(String name);
    public void setVisitingTeam(String name);
}

interface Football extends Sports {
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
}

class College implements Football {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamScore;
    private int visitingTeamScore;

    public void setHomeTeam(String name) {
        this.homeTeam = name;
    }

    public void setVisitingTeam(String name) {
        this.visitingTeam = name;
    }

    public void homeTeamScored(int points) {
        this.homeTeamScore += points;
    }

    public void visitingTeamScored(int points) {
        this.visitingTeamScore += points;
    }

    public String getWinner() {
        if (homeTeamScore > visitingTeamScore) {
            return homeTeam;
        } else if (homeTeamScore < visitingTeamScore) {
            return visitingTeam;
        } else {
            return "It's a tie match.";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String homeTeamName = scanner.nextLine();
        String visitingTeamName = scanner.nextLine();
        int homeTeamScore = scanner.nextInt();
        int visitingTeamScore = scanner.nextInt();

        College match = new College();
        match.setHomeTeam(homeTeamName);
        match.setVisitingTeam(visitingTeamName);
        match.homeTeamScored(homeTeamScore);
        match.visitingTeamScored(visitingTeamScore);

        System.out.println(homeTeamName + " " + homeTeamScore + " scored");
        System.out.println(visitingTeamName + " " + visitingTeamScore + " scored");
        String result = match.getWinner();
        if (result.equals("It's a tie match.")) {
            System.out.println(result);
        } else {
            System.out.println(result + " is the winner!");
        }

        scanner.close();
    }
}

CODE-3:

PROGRAM:
Write a java program to create interface RBI.

CODE:
interface RBI {
    String parentBank = "RBI";
    double rateOfInterest();
    default void policyNote() {
        System.out.println("RBI has a new Policy issued in 2023");
    }
    static void regulations() {
        System.out.println("RBI has updated new regulations in 2024.");
    }
}

class SBI implements RBI {
    public double rateOfInterest() {
        return 7.6;
    }
}

class Karur implements RBI {
    public double rateOfInterest() {
        return 7.4;
    }
}

public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        Karur karur = new Karur();

        sbi.policyNote();
        RBI.regulations();
        
        System.out.println("SBI rate of interest: " + sbi.rateOfInterest() + " per annum.");
        System.out.println("Karur rate of interest: " + karur.rateOfInterest() + " per annum.");
    }
}
