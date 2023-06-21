package Bai_10;

import java.util.Arrays;
import java.util.List;

public class ListString {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = 0;
        for (Integer number : numberList) {
            sum += number;
        }
        System.out.println(sum);
    }
}
