package nl.blue4it.bowlingkata;

public class BowlingGame {

    private int score;
    private int[] rolls = new int[21];
    private int counter;

    public void roll(int pins) {
        rolls[counter++] = pins;
    }

    public int getScore() {
        for(int i = 0; i < rolls.length; i++) {
            score += rolls[i];
            if(rolls[i] == 10){
                // strike
                score += rolls[i + 1];
                score += rolls[i + 2];
            }
        }
        return score;
    }

}
