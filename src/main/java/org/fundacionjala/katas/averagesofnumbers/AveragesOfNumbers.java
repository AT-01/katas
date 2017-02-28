package org.fundacionjala.katas.averagesofnumbers;

/**
 * Write a method, that gets an array of integer-numbers and return an array of the averages
 * of each integer-number and his follower, if there is one.
 */
final class AveragesOfNumbers {

    /**
     * Constructor private.
     */
    private AveragesOfNumbers() {
    }

    /**
     * This method gets an array of integer-numbers and return an array of the averages
     * of each integer-number and his follower, if there is one.
     *
     * @param numbers Array of integer-numbers.
     * @return and return an array of the averages.
     */
    static double[] averages(final int[] numbers) {
        final double[] res = new double[null == numbers || numbers.length == 0 ? 0 : numbers.length - 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = (numbers[i] + numbers[i + 1]) / 2.0;
        }
        return res;
    }
}
