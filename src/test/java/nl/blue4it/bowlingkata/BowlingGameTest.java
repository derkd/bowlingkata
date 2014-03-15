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

    @Test
    public void shouldGiveAScoreOf26WhenAStrikeIsThrownInTheFirstRollAnd4IsThrownInThe2ndAnd3rdRoll() throws Exception {
        bowlingGame.roll(10);

        bowlingGame.roll(4);
        bowlingGame.roll(4);

        assertThat(bowlingGame.getScore(), is(26));
    }

    @Test
    public void shouldGiveAScoreOf14WhenASpareIsThrown() throws Exception {
        bowlingGame.roll(1);
        bowlingGame.roll(9); // spare

        bowlingGame.roll(2); // first roll of 2nd frame

        assertThat(bowlingGame.getScore(), is(14));
    }

    @Test
    public void shouldGiveAScoreOf23When9isThrownInThe1stFrameASpareIsThrownInThe2ndFrameAnd2IsThrownInTheFirstRollOf3rdFrame()
            throws Exception {
        bowlingGame.roll(1);
        bowlingGame.roll(8);

        bowlingGame.roll(2);
        bowlingGame.roll(8); // spare

        bowlingGame.roll(2); // first roll of 3nd frame

        assertThat(bowlingGame.getScore(), is(23));
    }
}
