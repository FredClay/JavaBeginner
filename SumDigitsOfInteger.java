package TrainingModules;

public class SumDigitsOfInteger {
    // Takes a number as input, and prints the sum of the digits. I.e, 81 -> 9, as 8 + 1 == 9.

    public static void main (String[] args) {
        Integer input = 81;
        String str = input.toString();
        char[] newby = str.toCharArray();

        int result = 0;
        int focus;

        for (char x: newby) {
            focus = x -48;
            result += focus;
            }
        System.out.println(result);
        }
    }
