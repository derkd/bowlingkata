package nl.blue4it.bowlingkata;

public class BowlingGame {

    private int score;

    public void roll(int pins) {
        score += pins;
    }

    public int getScore() {
        return score;
    }

}
