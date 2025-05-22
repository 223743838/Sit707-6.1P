package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopUtilsTest {

	@Test
    public void testSumFirstNIntegersZero() {
        Assert.assertEquals(0, LoopUtils.sumFirstNIntegers(0));
    }

    @Test
    public void testSumFirstNIntegersTen() {
        Assert.assertEquals(55, LoopUtils.sumFirstNIntegers(10));
    }

    @Test
    public void testCountEvenNumbersEmpty() {
        Assert.assertEquals(0, LoopUtils.countEvenNumbers(new int[] {}));
    }

    @Test
    public void testCountEvenNumbersMixed() {
        Assert.assertEquals(3, LoopUtils.countEvenNumbers(new int[] {1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void testCountEvenNumbersAllOdd() {
        Assert.assertEquals(0, LoopUtils.countEvenNumbers(new int[] {1, 3, 5}));
    }

    @Test
    public void testCountEvenNumbersAllEven() {
        Assert.assertEquals(3, LoopUtils.countEvenNumbers(new int[] {2, 4, 6}));
    }
	
}
