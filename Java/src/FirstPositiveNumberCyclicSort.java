package src;

class FirstPositiveNumberCyclicSort {
    public static int missingFirstPositiveCyclicSort(int[] array) {
        var n = array.length;
        for(var i=0;i<n;i++){
            while(array[i]>0 && array[i]<=n && array[array[i]-1]!=array[i]){
                var temp = array[i];
                array[i]=array[temp-1];
                array[temp-1]=temp;
            }
        }

        for(var i=0;i<n;i++){
            if(array[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
    public static void main(String s[]){
        int[] num = {1,2,0,4,9,3,2,1,2,1};
        System.out.println("missing value is " + missingFirstPositiveCyclicSort(num));
    }
}
