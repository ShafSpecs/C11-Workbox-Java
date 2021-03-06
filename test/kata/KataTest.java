package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void additionTest() {
        Kata calculator = new Kata();

        int sum = calculator.add(2, 6);

        assertEquals(8, sum);
    }

    @Test
    public void subtractionTest() {
        Kata calculator = new Kata();

        int difference = calculator.subtract(6, 2);

        assertEquals(4, difference);
    }

    @Test
    public void absoluteSubtractionTest() {
        Kata calculator = new Kata();

        int difference = calculator.subtract(2, 4);

        assertEquals(2, difference);
    }

    @Test
    public void multiplicationTest() {
        Kata calculator = new Kata();

        int product = calculator.multiply(2, 6);

        assertEquals(12, product);
    }

    @Test
    public void divisionTest() {
        Kata calculator = new Kata();

        int quotient = calculator.divide(6, 2);

        assertEquals(3, quotient);
    }

    @Test
    public void cantDivideByZeroTest() {
        Kata calculator = new Kata();

        int quotient = calculator.divide(6, 0);

        assertEquals(0, quotient);
    }

    @Test
    public void testUTMEPrice() {
        Kata newOrder = new Kata();

        newOrder.order(5);

        assertEquals(9_000, newOrder.getPrice());
    }

    @Test
    public void testUTMEPriceForHigherRange() {
        Kata newOrder = new Kata();

        newOrder.order(10);

        assertEquals(16_000, newOrder.getPrice());
    }

    @Test
    public void testUTMEPriceForLowerRange() {
        Kata newOrder = new Kata();

        newOrder.order(1);

        assertEquals(2_000, newOrder.getPrice());
    }

    @Test
    public void testUTMEPriceForBulkPurchase() {
        Kata newOrder = new Kata();

        newOrder.order(400);

        assertEquals(440_000, newOrder.getPrice());
    }

    @Test
    public void testUTMEPriceForBulkPurchase3() {
        Kata newOrder = new Kata();

        newOrder.order(77);

        assertEquals(100_100, newOrder.getPrice());
    }

    @Test
    public void testUTMEPriceForBulkPurchase4() {
        Kata newOrder = new Kata();

        newOrder.order(123);

        assertEquals(147_600, newOrder.getPrice());
    }

    @Test
    public void testUTMEPriceForBulkPurchase2() {
        Kata newOrder = new Kata();

        newOrder.order(640);

        assertEquals(640_000, newOrder.getPrice());
    }

    @Test
    public void testUTMEPriceForBulkPurchase5() {
        Kata newOrder = new Kata();

        newOrder.order(31);

        assertEquals(46_500, newOrder.getPrice());
    }

    @Test
    public void bitFlipperTest0() {
        int flipped = Kata.bitFlipper(0);

        assertEquals(1, flipped);
    }

    @Test
    public void bitFlipperTest1() {
        int flipped = Kata.bitFlipper(1);

        assertEquals(0, flipped);
    }

    @Test
    public void oddNumberTest() {
        String odd = Kata.oddOrEven(13);

        assertEquals("Odd", odd);
    }

    @Test
    public void evenNumberTest() {
        String even = Kata.oddOrEven(24);

        assertEquals("Even", even);
    }

    @Test
    public void gradeBasicTest() {
        assertEquals("Pass", Kata.grade(95));
        assertEquals("Fail", Kata.grade(51));
    }

    @Test
    public void gradeCompTest() {
        assertEquals("A", Kata.gradingSystem(99));
        assertEquals("B", Kata.gradingSystem(84));
        assertEquals("C", Kata.gradingSystem(75));
        assertEquals("D", Kata.gradingSystem(69));
        assertEquals("F", Kata.gradingSystem(58));
    }

    @Test
    public void factorTest() {
        int factors = Kata.checkFactors(5);
        assertEquals(2, factors);

        factors = Kata.checkFactors(18);
        assertEquals(6, factors);
    }

    @Test
    public void isPrime() {
        boolean isPrime = Kata.isPrime(9);
        assertEquals(false, isPrime);

        isPrime = Kata.isPrime(5);
        assertEquals(true, isPrime);
    }

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, Kata.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, Kata.arrayDiff(new int [] {}, new int[] {1,2}));
    }
}