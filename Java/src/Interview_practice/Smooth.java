package src.Interview_practice;

import java.util.Random;

public class Smooth {

    public static double[] smooth(double[] in, int h) {
        int N = in.length;
        double[] out = new double[N];
        double[] prefixSum = new double[N + 1];

        for (int i = 0; i < N; i++) {
            prefixSum[i + 1] = prefixSum[i] + in[i];
        }

        for (int i = 0; i < N; i++) {
            int left = Math.max(0, i - h);
            int right = Math.min(N - 1, i + h);
            int windowSize = right - left + 1;
            out[i] = (prefixSum[right + 1] - prefixSum[left]) / windowSize;
        }
        return out;
    }

    public static void main(String[] args) {
        //double[] input = {1, 4, 2, 5, 3, 6, 4, 8, 5,6,6,3,4, 9, 7, 10};
        int windowSize = 50000;
        int arraySize = 10000000;
        double[] input = new double[arraySize];

        // Fill the array with random values between 1 and 10
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            input[i] = random.nextDouble() * 10 + 1;
        }
        double[] smoothed = smooth(input, windowSize);

        // Print the smoothed array
        for (double value : smoothed) {
            //System.out.print(value + " ");
        }
    }
}
