package nl.blue4it.bowlingkata;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BowlingGameTest {

    @Test
    public void shouldCreateInstance() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();

        assertThat(bowlingGame, is(instanceOf(BowlingGame.class)));
    }

    @Test
    public void shouldGiveAScoreOf0WhenNoPinIsDownForARoll() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();

        bowlingGame.roll(0);

        assertThat(bowlingGame.getScore(), is(0));
    }

    @Test
    public void shouldGiveAScoreOf5When5PinsAreDown() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();

        bowlingGame.roll(5);

        assertThat(bowlingGame.getScore(), is(5));
    }
}
