package Bai_04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Rekkei Academy để nông dân biết code";
        List<String> list = new ArrayList<>();

        String[] word = text.split(" ");

        for (String words : word) {
            if (words.length() > 3){
                list.add(words);
            }

        }
        System.out.println(list);

    }
}
