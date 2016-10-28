/**
 * Created by brunovasquez on 10/27/2016.
 */
public class Evaporator {

    public static int evaporator(double content, double evaPerDay, double threshold) {
        Double result = Math.ceil(Math.log(threshold/100) / Math.log(1-(evaPerDay/100)));
        return result.intValue();
    }
}
