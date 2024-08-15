package src;

public class maxWaterStore {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        var maxWater = maxArea(height);
        System.out.println("Max Area: " + maxWater);
    }

    private static int maxArea(int[] height) {
        if(height.length<2)
            return -1;

        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int width = right - left;
            int currentHeight = Math.min(height[left],height[right]);
            int currentArea = width * currentHeight;
            maxArea = Math.max(maxArea,currentArea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
