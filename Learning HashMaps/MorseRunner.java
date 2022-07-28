package TrainingModules;

public class MorseRunner {

    public static void main (String[] args) {
        String message = ".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-";
        MorseTranslator myMorse = new MorseTranslator();
        String translated = myMorse.morseToEnglish(message);
        System.out.println(translated);
    }

}
