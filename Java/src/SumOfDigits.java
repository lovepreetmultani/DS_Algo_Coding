package src;

public class SumOfDigits {

    public static void main(String args[]){
        int n = 132189;
        System.out.println("final result is:"+sumOfDigits(n));

    }

    private static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }else{
            int sum=0;
            while(n>0){

                if (n == 0) {
                    n = sum;
                    sum = 0;
                }
                sum+= n%10;
                n/=10;
            }
            return sumOfDigits(sum);
        }
    }
}
