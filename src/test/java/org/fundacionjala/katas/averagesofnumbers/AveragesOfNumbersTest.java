package org.fundacionjala.katas.averagesofnumbers;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link AveragesOfNumbers}.
 */
public class AveragesOfNumbersTest {
    /**
     * This method executed basic test.
     */
    @Test
    public void basicTests() {
        final double[] arrayExpected = {2, 2, 2, 2};
        final int[] arrayActual = {2, 2, 2, 2, 2};
        final String expected = Arrays.toString(arrayExpected);
        final String number = Arrays.toString(AveragesOfNumbers.averages(arrayActual));
        assertEquals(expected, number);
    }

    /**
     * This method executed basic test1.
     */
    @Test
    public void basicTests1() {
        final double[] arrayExpected = {0, 0, 0, 0};
        final int[] arrayActual = {2, -2, 2, -2, 2};
        final String expected = Arrays.toString(arrayExpected);
        final String number = Arrays.toString(AveragesOfNumbers.averages(arrayActual));
        assertEquals(expected, number);
    }

    /**
     * This method executed basic test2.
     */
    @Test
    public void basicTests2() {
        final double[] arrayExpected = {2, 4, 3, -4.5};
        final int[] arrayActual = {1, 3, 5, 1, -10};
        final String expected = Arrays.toString(arrayExpected);
        final String number = Arrays.toString(AveragesOfNumbers.averages(arrayActual));
        assertEquals(expected, number);
    }
}
