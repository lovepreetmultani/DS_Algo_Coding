package src.Interview_practice;

public class MyClass {
    public void myMethod(Object obj) {
        System.out.println("Object method called");
    }
    public void myMethod(String str) {
        System.out.println("String method called");
    }
    public static void main(String[] args) {
        var obj = new MyClass();
        obj.myMethod(null);
    }
}
