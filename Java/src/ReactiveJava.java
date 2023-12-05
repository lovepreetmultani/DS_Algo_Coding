package src;
import io.reactivex.Flowable;

public class ReactiveJava {
    public static void main(String[] args) {
        Flowable.just("Hello World!").subscribe(System.out::println);
    }
}
