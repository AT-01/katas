package org.fundacionjala.katas.quiz;

import org.junit.Test;

import static org.fundacionjala.katas.quiz.SpinWords.spinWords;
import static org.junit.Assert.assertEquals;

/**
 * {@link SpinWords}.
 */
public class SpinWordsTest {

    /**
     * Test one.
     */
    @Test
    public void testOne() {
        final String expected = "emocleW";
        final String text = "Welcome";
        assertEquals(expected, spinWords(text));
    }

    /**
     * Test two.
     */
    @Test
    public void testTwo() {
        final String expected = "Hey wollef sroirraw";
        final String text = "Hey fellow warriors";
        assertEquals(expected, spinWords(text));
    }

    /**
     * Test three.
     */
    @Test
    public void testThree() {
        final String expected = "This is a test";
        final String text = "This is a test";
        assertEquals(expected, spinWords(text));
    }

    /**
     * Test four.
     */
    @Test
    public void testFour() {
        final String expected = "This is rehtona test";
        final String text = "This is another test";
        assertEquals(expected, spinWords(text));
    }

    /**
     * Test five.
     */
    @Test
    public void testFive() {
        final String expected = "You are tsomla to the last test";
        final String text = "You are almost to the last test";
        assertEquals(expected, spinWords(text));
    }

    /**
     * Test six.
     */
    @Test
    public void testSix() {
        final String expected = "Just gniddik ereht is llits one more";
        final String text = "Just kidding there is still one more";
        assertEquals(expected, spinWords(text));
    }

    /**
     * Test seven.
     */
    @Test
    public void testSeven() {
        final String expected = "ylsuoireS this is the last one";
        final String text = "Seriously this is the last one";
        assertEquals(expected, spinWords(text));
    }
}
