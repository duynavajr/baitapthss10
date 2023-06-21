package Bai_08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.add("Anh long choi LOL ga vai noi");
        text.add("Anh Giang di hoc toan ngu");

        List<String> text2 = new ArrayList<>();

        text2.addAll(text);
        System.out.println(text2);

    }
}
