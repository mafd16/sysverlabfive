import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class bowlingTest {
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


    // --------------- Test for define game  -----------------
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



    // --------------- Test for -----------------
    /*@Test
    public void evaluatesExpression3() {
        ShellSort2 shellsort = new ShellSort2();
        Object[] item = new Object[]{1,3,2,5,4,7,9,6,11,13,8,14,10,12};
        shellsort.Shellsort(item);

        assertEquals(1, item[0]);
        assertEquals(2, item[1]);
        assertEquals(3, item[2]);
        assertEquals(4, item[3]);
        assertEquals(5, item[4]);
        assertEquals(6, item[5]);
        assertEquals(7, item[6]);
        assertEquals(8, item[7]);
        assertEquals(9, item[8]);
        assertEquals(10, item[9]);
        assertEquals(11, item[10]);
        assertEquals(12, item[11]);
    }*/

}