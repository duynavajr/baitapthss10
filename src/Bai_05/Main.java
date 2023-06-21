package Bai_05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Rikkei Acade mye";
        List<String> listString = new ArrayList<>();
        String[] list = text.split(" ");
        for (String lists : list) {
            listString.add(lists);
        }
        String min = listString.get(0);
        for (int i = 0; i < listString.size(); i++) {
            min = listString.get(i);
        }
        System.out.println(min);
    }
}
