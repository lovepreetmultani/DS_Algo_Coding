package src;

public class MissingfirstPositive {

    public static void main(String s[]){
        int[] num = {1,2,0};
        System.out.println("missing value is " + missingFirstPositive(num));
    }

    private static int missingFirstPositive(int[] nums) {
        int ans[] = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(val > 0 && val <= nums.length) {
                ans[val] = 1;
            }
        }
        for(int i = 1; i < ans.length; i++){
            if(ans[i] == 0){
                return i;
            }
        }
        return ans.length;
    }
}
