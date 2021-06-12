/**
 * Simulate Stopwatch Program
 * I/P -> Start the Stopwatch and End the Stopwatch
 * Logic -> Measure the elapsed time between start and end
 * O/P -> Print the elapsed time.
 *
 * @author: SAYANI KOLEY
 * @since: 12.06.2021
 */

import org.apache.commons.lang3.time.StopWatch;
import java.util.concurrent.TimeUnit;

public class SimulateStopWatch {
    public static void main(String args[]) throws InterruptedException {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();              //StopWatch started

        // sleep for 5 seconds
        TimeUnit.SECONDS.sleep(5);

        stopwatch.stop();               // StopWatch stopped

        long timeElapsed = stopwatch.getTime();
        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }
}
