package TrainingModules;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

    private final Map<String, String> MORSE_MAP;
    private final Map<String, String> ENGLISH_MAP;

    public MorseTranslator () {
        this.MORSE_MAP = new HashMap<>();
        this.ENGLISH_MAP = new HashMap<>();

        this.MORSE_MAP.put(".-", "a");
        this.MORSE_MAP.put("-...", "b");
        this.MORSE_MAP.put("-.-.", "c");
        this.MORSE_MAP.put("-..", "d");
        this.MORSE_MAP.put(".", "e");
        this.MORSE_MAP.put("..-.", "f");
        this.MORSE_MAP.put("--.", "g");
        this.MORSE_MAP.put("....", "h");
        this.MORSE_MAP.put("..", "i");
        this.MORSE_MAP.put(".---", "j");
        this.MORSE_MAP.put("-.-", "k");
        this.MORSE_MAP.put(".-..", "l");
        this.MORSE_MAP.put("--", "m");
        this.MORSE_MAP.put("-.", "n");
        this.MORSE_MAP.put("---", "o");
        this.MORSE_MAP.put(".--.", "p");
        this.MORSE_MAP.put("--.-", "q");
        this.MORSE_MAP.put(".-.", "r");
        this.MORSE_MAP.put("...", "s");
        this.MORSE_MAP.put("-", "t");
        this.MORSE_MAP.put("..-", "u");
        this.MORSE_MAP.put("...-", "v");
        this.MORSE_MAP.put(".--", "w");
        this.MORSE_MAP.put("-..-", "x");
        this.MORSE_MAP.put("-.--", "y");
        this.MORSE_MAP.put("--..", "z");
        this.MORSE_MAP.put("/", " ");

        // fill ENGLISH_MAP
        for (Map.Entry<String, String> entry: this.MORSE_MAP.entrySet()) {
            this.ENGLISH_MAP.put(entry.getValue(), entry.getKey());
        }

    }

    public String morseToEnglish (String input) {
        String finished = "";
        String[] splitInput = input.split(" ");

        for (String letter : splitInput) {
            finished += this.MORSE_MAP.get(letter);
        }
        return finished;
    }

    public String englishToMorse (String input) {
        String finished = "";
        String[] splitInput = input.split(" ");
        for (String word : splitInput) {
            char[] letters = word.toCharArray();
            for (char letter : letters) {
                System.out.println(letter);
                finished += this.ENGLISH_MAP.get("" + letter);
                finished += " ";
            }
            finished += "/ ";
        }
        return finished.substring(0, finished.length()-3);
    }

}
