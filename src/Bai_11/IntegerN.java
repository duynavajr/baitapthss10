package Bai_11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntegerN {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 3, 45, 1, 5);

        Integer num = Collections.min(numbers);
        System.out.println(num);
    }
}
