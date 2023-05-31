package bowling;

public class Bowling {

    private int[] bowls;

    public Bowling(int[] bowls) {
        this.bowls = bowls;
    }

    public int getGameScore() {
        int sum = 0;

        int frames = 10;
        int firstBowlOfFrame = 0;

        for(int frame = 0; frame < frames; frame++) {
            if(isStrike(bowls[firstBowlOfFrame])) {
                sum += bowls[firstBowlOfFrame] + bowls[firstBowlOfFrame+1] + bowls[firstBowlOfFrame+2];
                firstBowlOfFrame++;
            } else if(isSpare(firstBowlOfFrame)) {
                sum += bowls[firstBowlOfFrame] + bowls[firstBowlOfFrame+1] + bowls[firstBowlOfFrame+2];
                firstBowlOfFrame += 2;
            } else {
                sum += bowls[firstBowlOfFrame] + bowls[firstBowlOfFrame+1];
                firstBowlOfFrame += 2;

            }
        }

        return sum;
    }

    private boolean isSpare(int firstBowlOfFrame) {
        return (bowls[firstBowlOfFrame] + bowls[firstBowlOfFrame + 1]) == 10;
    }

    private boolean isStrike(int bowl) {
        return bowl == 10;
    }
}
