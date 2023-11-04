package src.Interview_practice;

import java.util.HashMap;

public class SockPairs {

    public static void main(String args[]){
        int[] inputArray= {10, 20, 20, 10, 10, 30, 50, 10, 20};  //{1,2,1,2,1,3,2}
        int n = inputArray.length;

        System.out.println("pair of socks are: "+sockPairs(inputArray,n));
    }

    private static int sockPairs(int[] inputArray, int n) {
            if(n<1){
            return 0;
        }
            int countPairs=0;
            HashMap<Integer, Integer> mapInput = new HashMap<>();
            for(int i =0;i<n;i++){
                if(mapInput.containsKey(inputArray[i]))
                {
                    mapInput.put(inputArray[i], mapInput.getOrDefault(inputArray[i],0)+1);
                }else
                {
                    mapInput.put(inputArray[i],1);
                }
            }

           for(int j: mapInput.values()){
               countPairs += j / 2;
            }


        return countPairs;
    }
}
