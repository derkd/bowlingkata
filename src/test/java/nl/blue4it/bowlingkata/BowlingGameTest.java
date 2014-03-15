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
        roll(0);

        assertThat(bowlingGame.getScore(), is(0));
    }

    @Test
    public void shouldGiveAScoreOf5When5PinsAreDown() throws Exception {
        roll(5);

        assertThat(bowlingGame.getScore(), is(5));
    }

    @Test
    public void shouldGiveAScoreOf26WhenAStrikeIsThrownInTheFirstRollAnd4IsThrownInThe2ndAnd3rdRoll() throws Exception {
        roll(10, 4, 4);

        assertThat(bowlingGame.getScore(), is(26));
    }

    @Test
    public void shouldGiveAScoreOf14WhenASpareIsThrown() throws Exception {
        roll(1, 9, 2);

        assertThat(bowlingGame.getScore(), is(14));
    }

    @Test
    public void shouldGiveAScoreOf23When9isThrownInThe1stFrameASpareIsThrownInThe2ndFrameAnd2IsThrownInTheFirstRollOf3rdFrame()
            throws Exception {
        roll(1, 8, 2, 8, 2);

        assertThat(bowlingGame.getScore(), is(23));
    }

    public void roll(int... rolls) {
        for(int roll : rolls) {
            bowlingGame.roll(roll);
        }

    }
}
