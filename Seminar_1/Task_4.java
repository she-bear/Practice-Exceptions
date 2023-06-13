package Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        String[] array_task4 = new String []{"1", null, "2"};
        System.out.println(checkArray(array_task4));
    }

    // Задача 4: метод, принимающий в качестве аргумента целочисленный одномерный массив
    // пройтись по каждому элементу и проверить, что он не равен null
    // реализовать логику:
    // если в ячейке встретился null - оповестить об этом пользователя
    // если null встретился в нескольких ячейках - "подсветить" эти ячейки

    public static List<Integer> checkArray(String[] arr) {
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                newArr.add(i);
        }

        return newArr;
    }
}
