package ProblemSolving;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class SentenceProfiling {

    public static void main (String[] args) {
        // cautious use of a scanner... *danger noises*
        Scanner sc = new Scanner(System.in);
        String userSentence = sc.nextLine().toLowerCase();

        // Map cannot contain primitives it would seem...
        Map<Character, Integer> myMap = new HashMap<>();

//        // fill map with chars.
//        // only good if you want to return '0-count' letters.
//        for (int n = 97; n <= 122; n++) {
//            char converted = (char)n;
//            myMap.put(converted, 0);
//        }

        Character ch;
        int chValue;

        // checks that a char is between 'a' and 'z' by converting it to ASCII, and if so, it counts it in the HashMap.
        // Another way to only count letters would be to preformat the string.
        for (int i = 0; i < userSentence.length(); i++) {
            ch = userSentence.charAt(i);
            chValue = (int)ch;
            if (97 <= chValue && chValue <= 122) {
                if (myMap.containsKey(ch)) {
                    myMap.put(ch, myMap.get(ch) + 1);
                }
                else {
                    myMap.put(ch, 1);
                }
            }

        }
        System.out.println(myMap);

    }

}
