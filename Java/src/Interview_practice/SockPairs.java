package src.Interview_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SockPairs {

    public static void main(String args[]){
        Integer[] inputArray= {10, 20, 20, 10, 10, 30, 50, 10, 20};  //{1,2,1,2,1,3,2}
        List<Integer> arr= Arrays.asList(inputArray);
        int n = inputArray.length;
        System.out.println("pair of socks are: "+sockPairs(arr,n));
    }

    private static int sockPairs(List<Integer> arr, int n) {
            if(n<1){
            return 0;
        }
            int countPairs=0;
            HashMap<Integer, Integer> mapInput = new HashMap<>();
            for(int i =0;i<n;i++){
                if(mapInput.containsKey(arr.get(i)))
                {
                    mapInput.put(arr.get(i), mapInput.getOrDefault(arr.get(i),0)+1);
                }else
                {
                    mapInput.put(arr.get(i),1);
                }
            }

           for(int count: mapInput.values()){
               countPairs+=count/2;
            }
        return countPairs;
    }
}
