package src.Interview_practice;

class StringRecursion {
    public static void main(String s[]){
        String str="hello";
        StringRecursion obj=new StringRecursion();
        obj.stringToReverse(str);
    }

    void stringToReverse(String str) {
        if((str.length()<=1) || (str==null)){
            System.out.println(str);
        }else{
        stringToReverse(str.substring(0,str.length()-1));}
    }
}
