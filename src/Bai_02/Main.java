package Bai_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberlist = new ArrayList<>();

        numberlist.add(1);
        numberlist.add(2);
        numberlist.add(3);
        numberlist.add(4);

        List<Integer> reversedList = new ArrayList<>();

        for (int i = numberlist.size() - 1; i >= 0; i--) {
            reversedList.add(numberlist.get(i));
        }
        System.out.println(reversedList);
    }


}
