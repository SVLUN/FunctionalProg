import java.util.function.BiFunction;

public class Chapter2video3 {
    public static void main (String[] args) {
        BiFunction<Integer,Integer,Integer>add = (x,y) -> x+y;
        System.out.println(add.apply(32,32));

        TriFunction<Integer, Integer,Integer,Integer> addThree = (x, y, z) -> x + y +z;
        System.out.println(addThree.apply(5,6,7));

        NoArgFunction<String> sayHello = () -> "Hello";
        System.out.println(sayHello.apply());
    }
}
