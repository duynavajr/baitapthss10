package Bai_09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo List chứa các số nguyên
        List<Integer> numberList = new ArrayList<>();

        // Thêm phần tử vào List
        numberList.add(5);
        numberList.add(2);
        numberList.add(8);
        numberList.add(5);
        numberList.add(3);
        numberList.add(8);
        numberList.add(2);

        // Xóa các phần tử trùng lặp trong List
        removeDuplicates(numberList);

        // In ra danh sách sau khi xóa các phần tử trùng lặp
        System.out.println("Danh sách sau khi xóa các phần tử trùng lặp:");
        for (int num : numberList) {
            System.out.print(num + " ");
        }
    }

    private static void removeDuplicates(List<Integer> list) {
        List<Integer> tempList = new ArrayList<>();
        for (int num : list) {
            if (!tempList.contains(num)) {
                tempList.add(num);
            }
        }
        list.clear();
        list.addAll(tempList);
    }
}
