package src;

import java.io.InputStreamReader;
import java.util.*;
public class BufferedReader {
        public static void main(String args[] ) throws Exception {
            java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
            System.out.println("please enter the size of array");
            int size = Integer.parseInt(br.readLine());

            int[] array = new int[size];
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            for(int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
                int minElement = findMinimumElement(array);
                System.out.println("The minimum element in the array is: " + minElement);


        }
    public static int findMinimumElement(int[] arr) {
        int minElement = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minElement) {
                minElement = arr[i];
            }
        }

        return minElement;
    }

}





