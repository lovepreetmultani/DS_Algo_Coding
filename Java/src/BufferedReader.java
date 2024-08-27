package src;

import java.io.InputStreamReader;
import java.util.*;
public class BufferedReader {
        public static void main(String args[] ) throws Exception {
            java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
            var size = Integer.parseInt(br.readLine());

            var array = new int[size];
            var input = br.readLine();
            var st = new StringTokenizer(input);

            for(int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
                var minElement = findMinimumElement(array);
                System.out.println("The minimum element in the array is: " + minElement)
        }
    public static int findMinimumElement(int[] arr) {
        var minElement = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return minElement;
    }

}





