import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class bowlingTest {
    // --------------- Test (1) for Frame  -----------------
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


    // --------------- Test (2) for Frame Score  -----------------
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


    // --------------- Test (3) for game  -----------------
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


    // --------------- Test (4) for game score  -----------------
    @Test
    public void evaluatesExpression4() {
        bowling bowling = new bowling();
        int game1[] = {1,5,3,6,7,2,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
        int gameScore1 = bowling.gameScore(game1);
        assertEquals(81, gameScore1);

        int game2[] = {2,5,3,6,7,2,3,6,5,4,5,4,3,3,4,5,8,1,2,6};
        int gameScore2 = bowling.gameScore(game2);
        assertEquals(84, gameScore2);
    }

    // --------------- Test (5) for identify strike  -----------------
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

    // --------------- Test (6) for calculate strike score  -----------------
    @Test
    public void evaluatesExpression5_2() {
        bowling bowling = new bowling();
        int frame1[] = {10,0};
        int frame2[] = {3,6};
        int frame3[] = {1,2};
        int sum1 = bowling.strikeSum(frame1, frame2, frame3);
        assertEquals(19, sum1);
    }

    // --------------- Test (7) for calculate game score incl. strike -----------
    @Test
    public void evaluatesExpression5_3() {
        bowling bowling = new bowling();
        int game1[] = {10,0,3,6,7,2,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
        int gameScore1 = bowling.gameScore(game1);
        assertEquals(94, gameScore1);
    }

    // --------------- Test (8) for identify spare  -----------------
    @Test
    public void evaluatesExpression6_1() {
        bowling bowling = new bowling();
        int frame1[] = {1,9};
        boolean spare1 = bowling.isSpare(frame1);
        assertEquals(true, spare1);

        int frame2[] = {4,6};
        boolean spare2 = bowling.isSpare(frame2);
        assertEquals(true, spare2);

        int frame3[] = {4,4};
        boolean spare3 = bowling.isSpare(frame3);
        assertEquals(false, spare3);
    }

    // --------------- Test (9) for calculate spare score  -----------------
    @Test
    public void evaluatesExpression6_2() {
        bowling bowling = new bowling();
        int frame1[] = {1,9};
        int frame2[] = {3,6};
        int sum1 = bowling.spareSum(frame1, frame2);
        assertEquals(13, sum1);
    }

    // ---- Test (10) for calculate game score incl. spare -----------
    @Test
    public void evaluatesExpression6_3() {
        bowling bowling = new bowling();
        int game1[] = {1,9,3,6,7,2,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
        int gameScore1 = bowling.gameScore(game1);
        assertEquals(88, gameScore1);
    }

    // -- Test (11) for calculate game score incl. strike followed
    // by a spare -----------
    @Test
    public void evaluatesExpression7() {
        bowling bowling = new bowling();
        int game1[] = {10,0,4,6,7,2,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
        int gameScore1 = bowling.gameScore(game1);
        assertEquals(103, gameScore1);
    }

    // ----- Test (12) for calculate game score incl.
    // ----- two subsequent strikes -----------
    @Test
    public void evaluatesExpression8() {
        bowling bowling = new bowling();
        int game1[] = {10,0,10,0,7,2,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
        int gameScore1 = bowling.gameScore(game1);
        assertEquals(112, gameScore1);
    }

    // ------ Test (13) for calculate game score incl.
    // ------ two spares in a row -----------
    @Test
    public void evaluatesExpression9() {
        bowling bowling = new bowling();
        int game1[] = {8,2,5,5,7,2,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
        int gameScore1 = bowling.gameScore(game1);
        assertEquals(98, gameScore1);
    }

    // ------ Test (14) for calculate game score when
    // ------ last frame is a spare. -----------
    @Test
    public void evaluatesExpression10() {
        bowling bowling = new bowling();
        int game1[] = {1,5,3,6,7,2,3,6,4,4,5,3,3,3,4,5,8,1,2,8,7};
        int gameScore1 = bowling.gameScore(game1);
        assertEquals(90, gameScore1);
    }
}
