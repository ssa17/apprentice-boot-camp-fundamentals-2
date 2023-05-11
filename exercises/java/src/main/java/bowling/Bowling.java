package bowling;

public class Bowling {

    public int getGameScore(int[] bowls) {
        int sum = 0;

        int frames = 10;
        int currentBowl = 0;

        for(int frame = 0; frame < frames; frame++) {
            int frameScore = bowls[currentBowl] + bowls[currentBowl+1];

            sum += frameScore;

            if(frameScore == 10) {
                sum += bowls[currentBowl+2];
            }

            currentBowl+=2;
        }

        return sum;
    }
}
