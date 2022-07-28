package TrainingModules;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnumsRPS {

    public static void main(String[] args) {
        List<String> results = new ArrayList<>();

//        Random r = new Random();
//        RoPaSc[] possChoices = RoPaSc.values();
//        RoPaSc randomPlayerChoice = possChoices[r.nextInt(possChoices.length)];

        // run the game 100 times. Can substitute the below 'playerChoice' with above 'randomPlayerChoice' if desired.
        RoPaSc playerChoice = RoPaSc.ROCK;

        for (int i = 0; i < 100; i++) {
            results.add(rps(playerChoice));
        }
        printResults(results);
    }

    public static String rps(RoPaSc choice) {
        RoPaSc compChoice;

//        or
//        Random generator = new Random();
//        RoPaSc compChoice = RoPaSc.values()[generator.nextInt(RoPaSc.values().length)];

        double percentage = Math.random();
        if (percentage < 0.333) {
            compChoice = RoPaSc.ROCK;
        } else if (percentage < 0.666) {
            compChoice = RoPaSc.PAPER;
        } else {
            compChoice = RoPaSc.SCISSORS;
        }

        // evaluate user choice against compChoice
        if (choice == compChoice) {
            return "DRAW";
        }
        if (choice == RoPaSc.ROCK) {
            if (compChoice == RoPaSc.PAPER) {
                return "LOSE";
            } else {
                return "WIN";
            }
        }
        if (choice == RoPaSc.SCISSORS) {
            if (compChoice == RoPaSc.ROCK) {
                return "LOSE";
            } else {
                return "WIN";
            }
        }
        if (choice == RoPaSc.PAPER) {
            if (compChoice == RoPaSc.SCISSORS) {
                return "LOSE";
            } else {
                return "WIN";
            }
        }
        return null;
    }

    public static void printResults(List<String> results) {
        int win = 0;
        int draw = 0;
        int loss = 0;

        for (String outcome : results) {
            if (outcome.equals("WIN")) win += 1;
            else if (outcome.equals("DRAW")) draw += 1;
            else loss += 1;
        }

        System.out.println("Wins: " + win);
        System.out.println("Draws: " + draw);
        System.out.println("Losses: " + loss);

    }

}
