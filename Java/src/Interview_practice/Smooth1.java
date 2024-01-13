package src.Interview_practice;

import java.util.Arrays;

public class Smooth1 {
    public static double[] smooth(double[] in, int h) {
        int N = in.length;
        double[] out = new double[N];

        for (int i = 0; i < N; i++) {
            double sum = 0;
            int count = 0;

            for (int k = Math.max(0, i - h); k <= Math.min(N - 1, i + h); k++) {
                sum += in[k];
                count++;
            }

            out[i] = sum / count;
        }

        return out;
    }

    public static void main(String[] args) {
        // Example usage
        double[] input = {1, 4, 2, 5, 3, 6, 4, 8, 5, 9, 7, 10};
        int h = 5;
        long startTime = System.nanoTime();// Smoothing window size
        double[] smoothed = smooth(input, h);  // Call the smoothing function
        System.out.println(Arrays.toString(smoothed));  // Output: [2.5, 3.6666666666666665, 3.4, 4.4, 4.8, 6.0, 6.5, 8.0, 8.5, 9.4, 9.25, 10.0]
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + executionTime);
    }
}
