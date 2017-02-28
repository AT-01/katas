package org.fundacionjala.katas.quiz;

/**
 * Deodorant Evaporator
 * Description:
 * This program tests the life of an calculateEvaporator containing a gas.
 * We know the content of the calculateEvaporator (content in ml), the percentage of foam or gas lost every day
 * evap_per_day) and the threshold (threshold) in percentage beyond which the calculateEvaporator is no longer useful.
 * All numbers are strictly positive.
 * The program reports the nth day (as an integer) on which the calculateEvaporator will be out of use.
 * Note : Content is in fact not necessary in the body of the function "calculateEvaporator",
 * you can use it or not use it, as you wish. Some people might prefer to reason with content,
 * some other with percentages only.
 * It's up to you but you must keep it as a parameter because the tests have it as an argument.
 */
final class Evaporator {

    /**
     * Constructor private.
     */
    private Evaporator() {
    }

    /**
     * The method reports the nth day (as an integer) on which the evaporator will be out of use.
     *
     * @param content          The content of the evaporator.
     * @param evaporatorPerDay The percentage of foam or gas lost every day.
     * @param threshold        in percentage beyond which the evaporator is no longer useful.
     * @return the nth day (as an integer).
     */
    static int calculateEvaporator(final double content, final double evaporatorPerDay, final double threshold) {
        final int percentage = 100;
        int days = 0;
        double contentPercentage = percentage;
        while (contentPercentage > threshold) {
            contentPercentage *= 1 - evaporatorPerDay / percentage;
            days++;
        }
        return days;
    }
}
