package org.fundacionjala.katas.bitcounting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class counts bits of a number.
 */
final class BitCounting {

    /**
     * Constructor private.
     */
    private BitCounting() {
    }

    /**
     * This method counts bits of a number.
     *
     * @param number Int with the number.
     * @return Return counts bits of a number.
     */
    static int countBits(final int number) {
        int countBitsOne = 0;
        final String binary = Integer.toBinaryString(number);
        final String regularExpression = "(1)";
        Matcher matcher = Pattern.compile(regularExpression).matcher(binary);
        while (matcher.find()) {
            countBitsOne++;
        }
        return countBitsOne;
    }

    /**
     * This method counts bits of a number.
     *
     * @param number Int with the number.
     * @return Return counts bits of a number.
     */
    static int countBits2(final int number) {
        final String binary = Integer.toBinaryString(number);
        return binary.replace("0", "").length();
    }

    /**
     * This method counts bits of a number.
     *
     * @param number Int with the number.
     * @return Return counts bits of a number.
     */
    static int countBits3(final int number) {
        return Integer.bitCount(number);
    }
}
