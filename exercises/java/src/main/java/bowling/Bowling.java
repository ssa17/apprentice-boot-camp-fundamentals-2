package bowling;

public class Bowling {

    public int getGameScore(int[] bowls) {
        int sum = 0;

        int frames = 10;
        int currentBowl = 0;


        for(int i = 0; i < frames; i++) {
            sum += bowls[currentBowl] + bowls[currentBowl+1];

            currentBowl+=2;
        }

        return sum;
    }
}
