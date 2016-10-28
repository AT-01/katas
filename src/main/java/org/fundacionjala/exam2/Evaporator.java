package org.fundacionjala.exam2;

/**
 * Calculates the quantity of days when the evaporator is useless.
 */
final class Evaporator {

    private static final int PERCENT_CONSTANT = 100;

    /**
     * Constructor.
     */
    private Evaporator() {
    }

    /**
     * calculate the number of days.
     *
     * @param contentMl        Double whit the total quantity.
     * @param evaPerDayPercent Double whit the percentage is lost per day.
     * @param threshold        Double whit the minimum quantity.
     * @return Int whit the number of days.
     */
    static int evaporator(final double contentMl, final double evaPerDayPercent, final double threshold) {
        double mlPerDay = contentMl * (evaPerDayPercent / PERCENT_CONSTANT);
        double minimumQuantity = contentMl * (threshold / PERCENT_CONSTANT);
        double totalContent = contentMl;
        int days = 0;
        do {
            days++;
            totalContent -= mlPerDay;
            mlPerDay = totalContent * (evaPerDayPercent / PERCENT_CONSTANT);
        } while (totalContent >= minimumQuantity);
        return days;
    }
}
