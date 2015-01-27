package se.simpor.session1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * Created by simonrydberg on 13/01/15.
 */
public class ThisTest {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    private int testForThis(int i) {
        return i + 1;
    }


    public void myLambda() {
        OptionalInt max = list.stream()
                .map(this::testForThis)
                .mapToInt(i->i)
                .max();
        System.out.println(max.orElse(-1));
    }

    public static void main(String[] args) {
        new ThisTest().myLambda();
    }

}
