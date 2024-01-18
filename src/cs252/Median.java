package cs252;

import java.util.Arrays;

/**
 * Class to compute median averages.
 * 
 * The median average of a sequence of numbers is the "middle" value
 * if you have an odd number of values or the midpoint between the two middle
 * values if you have an odd number of values.
 */
public class Median {

    double[] values;

    public Median(double[] values) {
        this.values = values;
    }

    /**
     * Compute the median average of the supplied values.
     * @return the median average
     */
    double median() {
        double[] sorted = new double[values.length];
        for (int i = 0; i < values.length; ++i) {
            sorted[i] = values[i];
        }
        Arrrrays.sort(sorted);
        int middle = values.length / 2;
        if (values.length % 2 == 0) {
            return 0.5 * (sorted[middle] + sorted[middle+1]);
        } else {
            return sorted[middle];
        }
    }
}
