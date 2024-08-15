package src;

public class lemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        int[] bills2 = {5,5,10,10,20};
        System.out.println("lemonade change " + lemonChange(bills));
    }
    private static boolean lemonChange(int[] bills) {
        var fiveDollar = 0;
        var tenDollar = 0;
        for(var bill: bills)
        {
            if(bill==5) {
                fiveDollar++;
            }else if(bill==10){
                if(fiveDollar==0){
                    return false;
                }
               tenDollar++;
                fiveDollar--;
            }
            else{
                if(fiveDollar>0 && tenDollar>0){
                    tenDollar--;
                    fiveDollar--;
                }else if(fiveDollar>=3){
                    fiveDollar-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
