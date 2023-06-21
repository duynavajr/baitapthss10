package Bai_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

        Collections.sort(numberList, Comparator.reverseOrder());
        System.out.println(numberList);
        
    }
}
