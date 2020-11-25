/*
 * Syed F Ali
 * COSC 565 Assignment II
 * Due Nov 24th, 2020
 */

package Assignment2;

public class Game
{
    static final int ALL_PINS_DOWN = 10;
    static final int FRAMES_PER_GAME = 10;
    static final int THROWS_PER_FRAME = 2;
    static final int EXTRA_THROW_AT_END_OF_GAME = 1;
    static final int MAX_THROWS = FRAMES_PER_GAME * THROWS_PER_FRAME + 
                                  EXTRA_THROW_AT_END_OF_GAME;

    int[] theThrows = new int[MAX_THROWS];
    int throwCount = 0;

    public String getScore(int frame)
    {
        if (!frameIsComplete(frame))
            return "";
        
        int score = 0;
        for (int i = 1; i <= frame; i++)
            score += howMuchThisFrameIsWorth(i);

        return Integer.toString(score);
    }
    private int sumOfLeftAndRightThrows(int frame)
    {
        return getLeftThrow(frame)+getRightThrow(frame);
    }
    private int howMuchThisFrameIsWorth(int frame)
    {
        if (isStrike(frame))
            return sumOfThreeThrows(frame);
        if (isSpare(frame))
            return sumOfLeftAndRightThrows(frame)+getLeftThrow(frame+1);
        return sumOfLeftAndRightThrows(frame);
    }
    private boolean isStrike(int frame)
    {
        return getLeftThrow(frame)==ALL_PINS_DOWN;
    }
    private boolean isSpare(int frame)
    {
        return sumOfLeftAndRightThrows(frame)==ALL_PINS_DOWN;
    }
    private int sumOfThreeThrows(int frame)
    {
        return sumOfThrows(frame,3);
    }
    private int sumOfThrows(int frame, int numberOfThrows)
    {
        int sum = 0;
        for (int i = 0; i < numberOfThrows; i++)
          sum += theThrows[getIndexOfFrame(frame)+i];
        return sum;
    }
    private int getLeftThrow(int frame)
    {
        return theThrows[getIndexOfFrame(frame)];
    }
    private int getRightThrow(int frame)
    {
        return theThrows[getRightThrowIndex(frame)];
    }
    public void setPinsKnockedDown(int pins)
    {
        theThrows[throwCount++] = pins;
    }
    public String getLeftBox(int frame)
    {
        return convertScore(getLeftThrow(frame));
    }
    private String convertScore(int score)
    {
        if (score == 0)
            return "";
        return ""+score;
    }
    private int getIndexOfFrame(int frame)
    {
        int index = 0;
        for (int i = 1; i < frame; i++)
            index += ballsInFrame(index);
        return index;
    }
    private int getLastIndexOfFrame(int frame)
    {
        return getIndexOfFrame(frame)+ballsInFrame(frame)-1;
    }
    private int getRightThrowIndex(int frame)
    {
        return getIndexOfFrame(frame)+1;
    }
    private boolean frameIsComplete(int frame)
    {
        return numberOfCompleteFrames() >= frame; 
    }
    private int numberOfCompleteFrames()
    {
        int count;
        for (count = 0; getLastIndexOfFrame(count+1) < throwCount; count++)
            ;
        return count;
    }
    private int ballsInFrame(int index)
    {
        if (theThrows[index]==ALL_PINS_DOWN)
            return 1;
        return 2;
    }
}

