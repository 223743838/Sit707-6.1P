package sit707_week6;

import static org.junit.Assert.assertThrows;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WeatherAndMathUtilsTest {
	
	@Test
    public void testStudentIdentity() {
        String studentId = "223743838";
        Assert.assertNotNull("Student ID is", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Sushma Singh";
        Assert.assertNotNull("Student name is", studentName);
    }

    // ------------------ isEven Tests ------------------

    @Test
    public void testTrueNumberIsEven() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(4));
    }

    @Test
    public void testFalseNumberIsEven() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(5));
    }

    @Test
    public void testIsEvenZero() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(0)); 
    }

    // ------------------ isPrime Tests ------------------

    @Test
    public void testPrimeNumber() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5));
    }

    @Test
    public void testNonPrimeNumber() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
    }

    @Test
    public void testPrimeNumber1() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(1)); // special case
    }

    @Test
    public void testIsPrimeThree() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(3)); // hits final return true
    }

    @Test
    public void testIsPrimeLoopCoverage() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(7)); // triggers full loop
    }

    // ------------------ weatherAdvice Tests ------------------
    

    @Test
    public void testConstantValues() {
        Assert.assertEquals(70.0, WeatherAndMathUtils.DANGEROUS_WINDSPEED, 0.0);
        Assert.assertEquals(6.0, WeatherAndMathUtils.DANGEROUS_RAINFALL, 0.0);
        Assert.assertEquals(45.0, WeatherAndMathUtils.CONCERNING_WINDSPEED, 0.0);
        Assert.assertEquals(4.0, WeatherAndMathUtils.CONCERNING_RAINFALL, 0.0);
    }
    
    
    @Test
    public void testWeatherAdviceDangerousWind() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(75.0, 0.0));
    }

    @Test
    public void testWeatherAdviceDangerousRain() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 7.0));
    }

    @Test
    public void testWeatherAdviceBothConcerning() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(46.0, 4.5));
    }

    @Test
    public void testWeatherAdviceWarnWind() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 2.0));
    }

    @Test
    public void testWeatherAdviceWarnRain() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(10.0, 5.0));
    }

    @Test
    public void testWeatherAdviceAllClear() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(10.0, 2.0));
    }

    @Test
    public void testNegativeWindSpeedThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            WeatherAndMathUtils.weatherAdvice(-5.0, 3.0);
        });
    }
     
}
