package nl.blue4it.bowlingkata;

public class BowlingGame {

    private int score;

    public void roll(int pins) {
        if(score == 10) {
            score += pins;
        }
        score += pins;
    }

    public int getScore() {
        return score;
    }

}
