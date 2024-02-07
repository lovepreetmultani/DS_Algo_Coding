package src.Interview_practice;

public class primeNumber {

    static boolean isPrime(int i) {
        if(i<=1){
            return false;
        }
        for(int j=2;j<i;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
    private static void printPrime(int n) {
        for(int i=2;i<n;i++){
            if (isPrime(i)) {
                System.out.println("print prime numbers:"+i);
            }
        }
    }

    public static void main(String s[]){
        int n = 7;
        printPrime(n);
    }
}
