package src.Interview_practice;

public class MyClass {
    public void myMethod(Object obj) {
        System.out.println("Object method called");
    }

    public void myMethod(String str) {
        System.out.println("String method called");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod(null); // This will call the method with String parameter
    }
}
