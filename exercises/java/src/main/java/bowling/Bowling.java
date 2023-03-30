package bowling;

public class Bowling {

    public int getGameScore(int[] bowls) {
        int sum = 0;

        for (int bowl : bowls) {
            sum += bowl;
        }

        return sum;
    }
}
