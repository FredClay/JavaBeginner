package TrainingModules;

import java.text.DecimalFormat;

public class Results {

    int physics;
    int biology;
    int chemistry;
    float total;
    float percentage;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Results (int physics, int biology, int chemistry) {
        this.physics = physics;
        this.biology = biology;
        this.chemistry = chemistry;
        this.total = 0;
        this.percentage = 0;
    }
    public void scores () {
        int[] reses = {this.physics, this.biology, this.chemistry};
        String[] topics = {"Physics", "Biology", "Chemistry"};

        for (int i = 0; i < topics.length; i++) {
            System.out.println("Score for " + topics[i] +": " + reses[i]);
        }
    }
    public void percentages () {
        this.total = this.physics + this.biology + this.chemistry;
        this.percentage = (this.total * 100) / 450;
        System.out.println("Final Score was: " + (int)this.total + "/450");
        System.out.println("Percentage = " + df.format(this.percentage) + "%");
    }

    public static void main(String[] args) {
        Results r = new Results(123, 144, 150);
        r.scores();
        r.percentages();
    }

}
