package TrainingModules;

public class MorseRunner {

    public static void main (String[] args) {
        String message = ".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-";
        MorseTranslator myMorse = new MorseTranslator();
        String translated = myMorse.morseToEnglish(message);
        System.out.println(translated);

        String mssg2 = "java is cool ok";
        String trans2 = myMorse.englishToMorse(mssg2);
        System.out.println(trans2);
    }

}
