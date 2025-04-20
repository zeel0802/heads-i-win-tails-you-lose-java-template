package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

public class AppTest {

    @Test
    public void testBiasedFlipResultsWithinBounds() {
        int n = 100;            // Number of flips
        double p = 0.7;         // Probability of heads
        int trials = 10;

        Random rand = new Random();

        for (int m = 0; m < trials; m++) {
            int heads = 0;
            for (int i = 0; i < n; i++) {
                if (rand.nextDouble() < p) {
                    heads++;
                }
            }
            // Check that heads count is between 0 and n
            assertTrue(heads >= 0 && heads <= n, "Heads count should be within valid range.");
        }
    }

    @Test
    public void testProbabilityEdgeCaseZero() {
        int n = 50;
        double p = 0.0;
        int heads = 0;

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            if (rand.nextDouble() < p) {
                heads++;
            }
        }
        assertEquals(0, heads, "With p=0.0, there should be no heads.");
    }

    @Test
    public void testProbabilityEdgeCaseOne() {
        int n = 50;
        double p = 1.0;
        int heads = 0;

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            if (rand.nextDouble() < p) {
                heads++;
            }
        }
        assertEquals(n, heads, "With p=1.0, all flips should be heads.");
    }
}
