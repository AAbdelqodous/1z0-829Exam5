package q12;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Point> predicate = Predicate.isEqual(new Point(2, 3)); // (object) -> new Point(2, 3).equals(object)`
        System.out.println(predicate.test(new Point(-1, 2)));
    }
}
