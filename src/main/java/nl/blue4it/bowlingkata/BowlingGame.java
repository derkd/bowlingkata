package nl.blue4it.bowlingkata;

public class BowlingGame {

    private int score;
    private int[] rolls = new int[20];
    private int counter = 0;

    public void roll(int pins) {
        rolls[counter++] = pins;
    }

    public int getScore() {
        for(int r = 0; r < 10; r++) {
            score += rolls[r];
            if(isStrike(r)){
                score += rolls[r + 1];
                score += rolls[r + 2];
            } else if(isSpare(r)) {
                score += rolls[r + 2];
            }
        }
        return score;
    }

    private boolean isSpare(int r) {
        // here we check if 2 rolls in 1 frame equals 10
        return r % 2 == 0 && rolls[r] + rolls[r + 1] == 10;
    }

    private boolean isStrike(int r) {
        return rolls[r] == 10;
    }

}
