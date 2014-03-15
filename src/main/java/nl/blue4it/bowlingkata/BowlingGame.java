package nl.blue4it.bowlingkata;

public class BowlingGame {

    private int score;
    private int[] rolls = new int[21];
    private int counter;

    public void roll(int pins) {
        rolls[counter++] = pins;
    }

    public int getScore() {
        for(int r = 0; r < counter; r++) {
            score += rolls[r];
            if(isStrike(r)){
                score += rolls[r + 1];
                score += rolls[r + 2];
            } else if(r % 2 == 0 && rolls[r] + rolls[r + 1] == 10) {
                score += rolls[r + 2];
            }
        }
        return score;
    }

    private boolean isStrike(int i) {
        return rolls[i] == 10;
    }

}
