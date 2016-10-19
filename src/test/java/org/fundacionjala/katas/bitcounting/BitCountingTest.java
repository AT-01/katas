package org.fundacionjala.katas.bitcounting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link BitCounting}.
 */
public class BitCountingTest {

    /**
     * Constructor the BitCounting class.
     */
    public BitCountingTest() {
    }

    /**
     * This method verify counts bits of a number.
     */
    @Test
    public void testGame1() {
        final int expected = 5;
        final int number = 1234;
        final int actual = BitCounting.countBits(number);
        assertEquals(expected, actual);
    }

    /**
     * This method verify counts bits of a number.
     */
    @Test
    public void testGame2() {
        final int expected = 1;
        final int number = 4;
        final int actual = BitCounting.countBits2(number);
        assertEquals(expected, actual);
    }

    /**
     * This method verify counts bits of a number.
     */
    @Test
    public void testGame3() {
        final int expected = 3;
        final int number = 7;
        final int actual = BitCounting.countBits3(number);
        assertEquals(expected, actual);
    }

    /**
     * This method verify counts bits of a number.
     */
    @Test
    public void testGame4() {
        final int expected = 2;
        final int number = 9;
        final int actual = BitCounting.countBits(number);
        assertEquals(expected, actual);
    }

    /**
     * This method verify counts bits of a number.
     */
    @Test
    public void testGame5() {
        final int expected = 2;
        final int number = 10;
        final int actual = BitCounting.countBits2(number);
        assertEquals(expected, actual);
    }
}
