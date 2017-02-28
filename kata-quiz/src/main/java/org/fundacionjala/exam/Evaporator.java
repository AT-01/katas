package org.fundacionjala.exam;

/**
 * Class that calculate the days that take the gas to evaporate.
 */
public class Evaporator {

    /**
     * Method that
     * @param content
     * @param evap_per_day
     * @param threshold
     * @return
     */
    public static int evaporator(double content, double evap_per_day, double threshold) {
        double minContent = content*threshold/100;
        int days = 0;
        while(content >  minContent){
            content -= content*evap_per_day/100;
            days++;
        }
        return days;
    }
}
