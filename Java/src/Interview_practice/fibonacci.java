import java.util.ArrayList;
import java.util.List;

public class fibonacci {

    public static List<Integer> fibonacci(int n){
        List<Integer> list = new ArrayList<>();
        int firstElement =0;
        int secondElement=1;
        int sum=0;
        System.out.println(firstElement+ " " +secondElement);
        for (int i = 2;i<n;i++){
            sum=firstElement+secondElement;
            firstElement=secondElement;
            secondElement=sum;
            list.add(sum);
        }
        return list;
    }
    public static void main(String args[]){
        int n = 10;
        System.out.println("series is:"+fibonacci(n));
    }
}