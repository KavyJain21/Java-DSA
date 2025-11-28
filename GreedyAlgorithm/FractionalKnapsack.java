package GreedyAlgorithm;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String[] args) {
        // Item values and weights
        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50;

        // Create an array to store value-to-weight ratio and index
        double[][] ratio = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = (double) val[i] / weight[i]; // value/weight
            ratio[i][1] = i; // original index
        }

        // Sort items by ratio in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[0]));

        double finalValue = 0;

        // Traverse items from highest ratio to lowest
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][1];
            if (capacity >= weight[idx]) {
                // Take full item
                finalValue += val[idx];
                capacity -= weight[idx];
            } else {
                // Take fractional part
                finalValue += ratio[i][0] * capacity;
                break;
            }
        }

        System.out.println("Final value = " + finalValue);
    }
}
