package bowling;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class BowlingTest {
    @Test
    public void twentyBowls_withScoreOf0() {
        Bowling bowling = new Bowling();

        int[] bowls = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        assertThat(bowling.getGameScore(bowls)).isEqualTo(0);
    }

    @Test
    public void twentyBowls_withScoreOf20() {
        Bowling bowling = new Bowling();

        int[] bowls = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        assertThat(bowling.getGameScore(bowls)).isEqualTo(20);
    }

    @Test
    public void twentyBowls_withFirstFrameAsSpare() {
        Bowling bowling = new Bowling();

        int[] bowls = new int[]{1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        assertThat(bowling.getGameScore(bowls)).isEqualTo(29);
    }
}
