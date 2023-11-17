package src.Interview_practice;

class StringRecursion {
    public static void main(String s[]){
        String str="hello";
        StringRecursion strToReverse=new StringRecursion();
        strToReverse.stringToReverse(str);
    }

    void stringToReverse(String str) {
        if(str.length()<1 || str==null){
            System.out.println("Null string");
        }
        stringToReverse(str.substring(0,str.length()-1));
    }
}
