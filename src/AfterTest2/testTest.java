package AfterTest2;

import org.junit.Assert;

public class testTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getLastNumber() {
    int lastnumber = Test.getLastNumber(new int[]{1,2,3,6});
        Assert.assertEquals(6,lastnumber);
    }

    @org.junit.Test
    public void countEvenNumbers() {
        int cnt = Test.countEvenNumbers(new int[]{1,2,3,4});
        Assert.assertEquals(2,cnt);
    }

    @org.junit.Test
    public void countSameNumbers() {
    }

    @org.junit.Test
    public void matrixTopLeftNumber() {
    }

    @org.junit.Test
    public void matrixDiagonalDifference() {
    }

    @org.junit.Test
    public void stairs() {
    }

    @org.junit.Test
    public void kangaroosMeet() {
    }

    @org.junit.Test
    public void kangaroosMeet2() {
    }
}