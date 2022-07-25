package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class MissingNumbers {

    public static void main (String[] args) {

        // Could use Random to remove a number at random from the complete 1-10 array.
        int[] transmission = {5, 2, 1, 8, 9, 7, 10, 4, 6};
        Map<Integer, Integer> m = new HashMap<>();

        for (int num : transmission) {
            m.put(num, 0);
        }

        for (int i = 1; i <= 10; i++) {
            if (!m.containsKey(i)) {
                // return 'i' here if doing it properly.
                System.out.println(i);
            }
        }

    }

}
