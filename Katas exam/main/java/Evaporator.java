/**
 * Deodorant Evaporator.
 * <p>
 * Description:
 * <p>
 * This program tests the life of an evaporator containing a gas.
 * <p>
 * We know the content of the evaporator (content in ml), the percentage of foam or gas lost every day (evap_per_day) and the
 * threshold (threshold) in percentage beyond which the evaporator is no longer useful. All numbers are strictly positive.
 * <p>
 * The program reports the nth day (as an integer) on which the evaporator will be out of use.
 * <p>
 * Note : Content is in fact not necessary in the body of the function "evaporator", you can use it or not use it, as you wish.
 * Some people might prefer to reason with content, some other with percentages only. It's up to you but you must keep it
 * as a parameter because the tests have it as an argument.
 */
public class Evaporator {

    private static final int PERCENTAGE = 100;

    /**
     * Obtains the days that the evaporator expends until get the
     * threshold of the contain decreasing the evaporation per day
     * in percentage.
     *
     * @param content           is the total content.
     * @param evaporationPerDay the quantity in percentage of the evaporation per day.
     * @param threshold         is the limit in percentage.
     * @return the quantity of the days.
     */
    static int evaporator(double content, double evaporationPerDay, double threshold) {
        double limitContent = (content * threshold) / PERCENTAGE;
        int daysCounter = 0;
        while (content > limitContent) {
            content -= (content * evaporationPerDay) / PERCENTAGE;
            daysCounter++;
        }
        return daysCounter;
    }
}