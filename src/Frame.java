/*
 * Syed F Ali
 * COSC 565 Assignment II
 * Due Nov 24th, 2020
 */

package Assignment2;

public class Frame {

    private int[] pins = new int[3];
    private int throwCount;
    private Frame nextFrame;

    public int getScore() {
        final int INDEX_OF_LAST_SCORABLE_FRAME = 9;
        return getScore(INDEX_OF_LAST_SCORABLE_FRAME);
    }

    public int getScore(int frameIndex) {
        if (!isScoreAvailable())
            return 0;
        return totalPins() + getScoreForNextFrame(frameIndex);
    }

    private int getScoreForNextFrame(int frameIndex) {
        if (nextFrame == null || frameIndex == 0)
            return 0;
        return nextFrame.getScore(frameIndex - 1);
    }

    public void addPins(int pins) {
        if (isFull())
            giveThrowToNextFrame(pins);
        if (throwCount < throwsNeededForScore())
            this.pins[throwCount++] = pins;
    }

    private void giveThrowToNextFrame(int pins) {
        if (nextFrame == null)
            nextFrame = new Frame();
        nextFrame.addPins(pins);
    }

    private boolean isScoreAvailable() {
        return throwCount >= throwsNeededForScore();
    }

    private int throwsNeededForScore() {
        if (isStrike() || isSpare())
            return 3;
        return 2;
    }

    private boolean isStrike() {
        return pins[0] == 10;
    }

    private boolean isSpare() {
        return pins[0] + pins[1] == 10;
    }
    
    private int totalPins() {
        int total = 0;
        for (int i = 0; i < throwsNeededForScore(); i++)
            total += pins [i];
        return total;
    }

    private boolean isFull() {
        return isStrike() || throwCount >= 2;
    }

}
