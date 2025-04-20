package org.example;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        int[] flipCounts = {10, 100, 500, 1000, 2000};      // n values
        double[] probabilities = {0.25, 0.5, 0.75};         // p values
        int trials = 10;                                    // m value

        Random rand = new Random();

        System.out.println("Number of Flips (n)\tTrial Number (m)\tProbability of Heads (p)\tNumber of Heads");
        for (int n : flipCounts) {
            for (double p : probabilities) {
                for (int m = 1; m <= trials; m++) {
                    int heads = 0;
                    for (int i = 0; i < n; i++) {
                        if (rand.nextDouble() < p) {
                            heads++;
                        }
                    }
                    System.out.printf("%d\t\t\t%d\t\t\t%.2f\t\t\t\t%d%n", n, m, p, heads);
                }
            }
        }
    }
}
