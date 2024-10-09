import java.util.*;

public class Needle {

    private Random generator;
    public Needle() {
        generator = new Random();
    }

    public double runExperiment(int totalDrops)
    {
        int hits = 0;
        int i = 0;
        while( i < totalDrops)
        {
            double  y_low = generator.nextDouble(0, 2);
            double alpha = generator.nextDouble(0, 180);
            double y_high = y_low + Math.sin(alpha * Math.PI / 180.0);
            if (y_high >= 2 || y_low - Math.sin(alpha* Math.PI / 180.0) <= 0)
            {
                hits++;
            }
            i++;
        }
        if (hits == 0)
        {
            return Double.POSITIVE_INFINITY;
        }
        return (double) totalDrops / hits;


    }
}