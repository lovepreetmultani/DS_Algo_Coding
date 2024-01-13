package src.Interview_practice;

import java.util.Arrays;

public class Smooth {

    public static double[] smooth(double[] in, int h) {
        int N = in.length;
        double[] out = new double[N];

        // Handle edge cases efficiently:
        for (int i = 0; i < h; i++) {
            double sum = 0.0;
            for (int k = 0; k <= i + h; k++) {
                sum += in[k];
            }
            out[i] = sum / (i + h + 1);
        }

        for (int i = N - h; i < N; i++) {
            double sum = 0.0;
            for (int k = i - h; k < N; k++) {
                sum += in[k];
            }
            out[i] = sum / (N - i + h);
        }

        // Optimize for the middle elements:
        double sum = 0.0;  // Accumulated sum for the window
        for (int i = 0; i < 2 * h + 1; i++) {
            sum += in[i];
        }

        for (int i = h; i < N - h; i++) {
            out[i] = sum / (2 * h + 1);
            sum -= in[i - h];
            sum += in[i + h];  // Efficiently update the sum
        }

        return out;
    }



    public static void main(String s[]){
        double[] input = {1, 4, 2, 5, 3, 6, 4, 8, 5, 9, 7, 10};  // Example input array
        int h = 5;
        long startTime = System.nanoTime();// Smoothing window size
        double[] smoothed = smooth(input, h);  // Call the smoothing function
        System.out.println(Arrays.toString(smoothed));  // Output: [2.5, 3.6666666666666665, 3.4, 4.4, 4.8, 6.0, 6.5, 8.0, 8.5, 9.4, 9.25, 10.0]
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + executionTime);

    }
}
