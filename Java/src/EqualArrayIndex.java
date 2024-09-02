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
        var sum=0;
        var leftsum=0;
        for(var n:arr){
            sum+=n;
        }
        for(var i =0;i<arr.length;i++){
            var rightsum=sum-leftsum-arr[i];

            if(leftsum==rightsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }

}
