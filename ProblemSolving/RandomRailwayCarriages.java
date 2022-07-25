package ProblemSolving;

import java.util.Random;

public class RandomRailwayCarriages {

    public static void main (String[] args) {

        // This is an unnecessary spin on the Railway Monitoring problem, that spawned from me
        // misinterpreting the assignment.

        // E.g. Max Capacity is 100, and there are 7 carriages lettered A -> A+6 ('A' -> 'G').
        int maxCap = 100;
        int numCarriages = 7;

        char[] carriages = new char[numCarriages];
        int[] carriageOccupancy = new int[numCarriages];

        // is there a better way to iterate through the alphabet??...
        // This block of code will name the carriages.
        int upTo = 65 + numCarriages;
        for (int i = 65; i < upTo; i++) {
            char convertedNum = (char) i;
            carriages[i-65] = convertedNum;
        }

        // Now we need to fill the carriages (the carriageOccupancy array).
        // create a Random object to fill the first n-1 carriages, where n is the number of carriages.
        // The last carriage will take all the remaining passengers, so it does not need to be randomly generated.
        Random r = new Random();
        int rollingCap = maxCap;
        for (int j = 0; j < numCarriages - 1; j++) {
            int thisCarriage = r.nextInt(rollingCap+1);
            carriageOccupancy[j] = thisCarriage;
            rollingCap -= thisCarriage;
        }
        carriageOccupancy[numCarriages-1] = rollingCap;

        // Now that the carriages are filled, we can find the first one with an occupancy of less that a
        // specified percentage.
        int percThreshold = 5;

        for (int k = 0; k < numCarriages; k++) {
            int threshNeeded = (percThreshold * 100) / maxCap;
            if (carriageOccupancy[k] < threshNeeded) {
                System.out.println("Carriage " + carriages[k] + " has less than " + percThreshold +
                        "% of the train's max capacity with " + carriageOccupancy[k] + " passenger(s)!");
            }
        }


    }

}
