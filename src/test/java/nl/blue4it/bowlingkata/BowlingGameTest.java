package nl.blue4it.bowlingkata;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void shouldGiveAScoreOf0WhenNoPinIsDownForARoll() throws Exception {
        bowlingGame.roll(0);

        assertThat(bowlingGame.getScore(), is(0));
    }

    @Test
    public void shouldGiveAScoreOf5When5PinsAreDown() throws Exception {
        bowlingGame.roll(5);

        assertThat(bowlingGame.getScore(), is(5));
    }
}
