package bowling;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class BowlingTest {
    @Test
    public void twentyBowls_withScoreOf0() {
        int[] bowls = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Bowling bowling = new Bowling(bowls);

        assertThat(bowling.getGameScore()).isEqualTo(0);
    }

    @Test
    public void twentyBowls_withScoreOf20() {
        int[] bowls = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        Bowling bowling = new Bowling(bowls);

        assertThat(bowling.getGameScore()).isEqualTo(20);
    }

    @Test
    public void twentyBowls_withFirstFrameAsSpare() {
        int[] bowls = new int[]{1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        Bowling bowling = new Bowling(bowls);

        assertThat(bowling.getGameScore()).isEqualTo(29);
    }

    @Test
    public void twentyBowls_withFirstFrameAsStrike() {
        int[] bowls = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        Bowling bowling = new Bowling(bowls);

        assertThat(bowling.getGameScore()).isEqualTo(30);
    }
}
