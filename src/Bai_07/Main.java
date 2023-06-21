package Bai_07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> number= new ArrayList<>();
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        List<Integer> newNum = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            if (i % 2 != 0){
                newNum.add(number.get(i));
            }
        }
        System.out.println(newNum);
    }
}
