package ProblemSolving;

import java.util.Random;

public class RailwayMonitoring {

    public static void main (String[] args) {

        int maxPerCarriage = 100;

        // numCarriages should not exceed 26 with current code.
        int numCarriages = 26;

        char[] carriages = new char[numCarriages];
        int[] carriageOccupancy = new int[numCarriages];

        // This block of code will name the carriages.
        int upTo = 65 + numCarriages;
        for (int i = 65; i < upTo; i++) {
            char convertedNum = (char) i;
            carriages[i-65] = convertedNum;
        }

        Random r = new Random();
        for (int j = 0; j <numCarriages; j++) {
            int occupancy = r.nextInt(maxPerCarriage + 1);
            carriageOccupancy[j] = occupancy;
        }

        int percThreshold = 20;
        for (int k = 0; k < numCarriages; k++) {
            int threshNeeded = (percThreshold * 100) / maxPerCarriage;
            if (carriageOccupancy[k] < threshNeeded) {
                System.out.println("Carriage " + carriages[k] + " has less than " + percThreshold +
                        "% of its max capacity with just " + carriageOccupancy[k] + " passenger(s)!");
            }
        }


    }

}
