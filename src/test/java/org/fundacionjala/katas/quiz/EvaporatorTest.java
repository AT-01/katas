package org.fundacionjala.katas.quiz;

import org.junit.Test;

import static org.fundacionjala.katas.quiz.Evaporator.calculateEvaporator;
import static org.junit.Assert.assertEquals;

/**
 * {@link Evaporator}.
 */
public class EvaporatorTest {

    /**
     * test evaporator one.
     */
    @Test
    public void testEvaporatorOne() {
        final int expected = 22;
        final int content = 10;
        final int evaporatorPerDay = 10;
        final int threshold = 10;
        assertEquals(expected, calculateEvaporator(content, evaporatorPerDay, threshold));
    }

    /**
     * test evaporator two.
     */
    @Test
    public void testEvaporatorTwo() {
        final int expected = 29;
        final int content = 10;
        final int evaporatorPerDay = 10;
        final int threshold = 5;
        assertEquals(expected, calculateEvaporator(content, evaporatorPerDay, threshold));
    }

    /**
     * test evaporator three.
     */
    @Test
    public void testEvaporatorThree() {
        final int expected = 59;
        final int content = 100;
        final int evaporatorPerDay = 5;
        final int threshold = 5;
        assertEquals(expected, calculateEvaporator(content, evaporatorPerDay, threshold));
    }

    /**
     * test evaporator four.
     */
    @Test
    public void testEvaporatorFour() {
        final int expected = 37;
        final int content = 37;
        final int evaporatorPerDay = 12;
        final int threshold = 1;
        assertEquals(expected, calculateEvaporator(content, evaporatorPerDay, threshold));
    }

    /**
     * test evaporator five.
     */
    @Test
    public void testEvaporatorFive() {
        final int expected = 31;
        final double content = 47.5;
        final int evaporatorPerDay = 8;
        final double threshold = 8;
        assertEquals(expected, calculateEvaporator(content, evaporatorPerDay, threshold));
    }

    /**
     * test evaporator six.
     */
    @Test
    public void testEvaporatorSix() {
        final int expected = 459;
        final double content = 100;
        final int evaporatorPerDay = 1;
        final double threshold = 1;
        assertEquals(expected, calculateEvaporator(content, evaporatorPerDay, threshold));
    }

    /**
     * test evaporator seven.
     */
    @Test
    public void testEvaporatorSeven() {
        final int expected = 459;
        final double content = 10;
        final int evaporatorPerDay = 1;
        final double threshold = 1;
        assertEquals(expected, calculateEvaporator(content, evaporatorPerDay, threshold));
    }

    /**
     * test evaporator eight.
     */
    @Test
    public void testEvaporatorEight() {
        final int expected = 299;
        final double content = 100;
        final int evaporatorPerDay = 1;
        final double threshold = 5;
        assertEquals(expected, calculateEvaporator(content, evaporatorPerDay, threshold));
    }
}
