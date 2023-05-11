package bowling;

public class Bowling {

    public int getGameScore(int[] bowls) {
        int sum = 0;

        int frames = 10;
        int currentBowl = 0;

        for(int frame = 0; frame < frames; frame++) {
            if(bowls[currentBowl] == 10) {
                sum += bowls[currentBowl] + bowls[currentBowl+1] + bowls[currentBowl+2];
                currentBowl++;
            } else if((bowls[currentBowl] + bowls[currentBowl + 1]) == 10) {
                sum += bowls[currentBowl] + bowls[currentBowl+1] + bowls[currentBowl+2];
                currentBowl += 2;
            } else {
                sum += bowls[currentBowl] + bowls[currentBowl+1];
                currentBowl += 2;

            }
        }

        return sum;
    }
}
