import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class bowlingTest {
    // --------------- Test for Frame  -----------------
    @Test
    public void evaluatesExpression1() {
        bowling bowling = new bowling();
        int frame1[] = {1,5};
        boolean isFrame1 = bowling.isFrame(frame1);
        assertEquals(true, isFrame1);

        int frame2[] = {1,5,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
        boolean isFrame2 = bowling.isFrame(frame2);
        assertEquals(false, isFrame2);
    }


    // --------------- Test for Frame Score  -----------------
    @Test
    public void evaluatesExpression2() {
        bowling bowling = new bowling();
        int item[] = {2,4};
        int sum = bowling.ordinaryFrameScore(item);
        assertEquals(6, sum);

        int item2[] = {2,6};
        int sum2 = bowling.ordinaryFrameScore(item2);
        assertEquals(8, sum2);

        int item3[] = {0,9};
        int sum3 = bowling.ordinaryFrameScore(item3);
        assertEquals(9, sum3);
    }


    // --------------- Test for game  -----------------
    @Test
    public void evaluatesExpression3() {
        bowling bowling = new bowling();
        int game1[] = {1,5,3,6,7,2,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
        boolean isGame1 = bowling.isGame(game1);
        assertEquals(true, isGame1);

        int game2[] = {1,5,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
        boolean isGame2 = bowling.isGame(game2);
        assertEquals(false, isGame2);
    }


    // --------------- Test for game score  -----------------
    @Test
    public void evaluatesExpression4() {
        bowling bowling = new bowling();
        int game1[] = {1,5,3,6,7,2,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
        int gameScore1 = bowling.gameScore(game1);
        assertEquals(81, gameScore1);

        int game2[] = {2,5,3,7,7,2,3,6,6,4,5,4,3,3,4,5,8,1,2,6};
        int gameScore2 = bowling.gameScore(game2);
        assertEquals(86, gameScore2);
    }

    // --------------- Test for identify strike  -----------------
    @Test
    public void evaluatesExpression5_1() {
        bowling bowling = new bowling();
        int frame1[] = {1,5};
        boolean strike1 = bowling.isStrike(frame1);
        assertEquals(false, strike1);

        int frame2[] = {10,0};
        boolean strike2 = bowling.isStrike(frame2);
        assertEquals(true, strike2);
    }

    // --------------- Test for calculate strike score  -----------------
    @Test
    public void evaluatesExpression5_2() {
        bowling bowling = new bowling();
        int frame1[] = {10,0};
        int frame2[] = {3,6};
        int sum1 = bowling.strikeSum(frame1, frame2);
        assertEquals(19, sum1);
    }


}
