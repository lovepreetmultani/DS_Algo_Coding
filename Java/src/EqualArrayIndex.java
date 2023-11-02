package src;

public class EqualArrayIndex {
public static void main(String s[]){
    int[] arr= {1,2,3,4,3,2,1};
    System.out.println("index is " + equalArrayIndex(arr));
}

    private static int equalArrayIndex(int[] arr) {
        if(arr.length<1){
            return -1;
        }
        int sum=0;
        int leftsum=0;
        for(int n:arr){
            sum+=n;
        }
        for(int i =0;i<arr.length;i++){
            int rightsum=sum-leftsum-arr[i];

            if(leftsum==rightsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }

}
