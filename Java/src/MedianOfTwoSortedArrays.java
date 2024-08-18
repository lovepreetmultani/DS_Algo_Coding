package src;

import java.util.Arrays;
import java.util.stream.IntStream;
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median one is: " + findMedianSortedArrays(nums1, nums2));
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median two is: " + findMedianSortedArrays(nums3, nums4));
    }
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        var mergedArray = IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).sorted().toArray();
        var length = mergedArray.length;
        if(length%2==1){
            return mergedArray[length/2];
        }else{
           return (mergedArray[length/2-1] + mergedArray[length/2])/2.0;
        }
    }
}
