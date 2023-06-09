package Seminar_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задача 0
        int[] array = new int []{1, 2, 3, 4};
        int a = ex0(array);
        if (a == -1)
            System.out.println("Return -1");
        else {

        };

        // Задача 1
        int[] array_task1 = new int []{1, 2, 3, 4, 5};
        view(array_task1);
        int[] array_task11 = {};
        view(array_task11);
        int[] array_task12 = null;
        view(array_task12);
    }

    // Задача 0: реализуйте метод, принимающий в качестве аргумента целочисленный массив
    // если длина массива меньше некоторого заданного минимума, метод возв. -1, иначе - длину массива
    static int ex0(int[] array) {
        int minSize = 5;
        if (array.length < minSize)
            return -1;
        else
            return array.length;
    }

    // Задача 1: метод принимает в качестве аргумента целочисленный массив и некоторое значение
    // return -1: если длина массива меньше заданного минимума (см. задачу 0)
    // return -2: искомый элемент не найден
    // return -3: если вместо массива пришёл null
    // придумать свою ситуацию
    public static int searchIndex(int[] arr, int num) {
        int index;
        if (arr == null) {
            return -3;
        }

        if (arr.length == 0) {
            return -4;
        }

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                index = i;
                return index;
            }    
        }

        return -2;
    }

    // Задача 1: метод, реализующий взаимодействие с пользователем
    public static void view(int[] arr) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input search number");
        int num = iScanner.nextInt();
        int result = searchIndex(arr, num);
        switch(result){
            case -1:
                System.out.println("Length short");
                break;
            case -2:
                System.out.println("Element not found");
                break;
            case -3:
                System.err.println("Array is null");
                break;
            case -4:
                System.out.println("Array is empty");
                break;
            default:
                System.out.println("Element index is " + result);
        }
    }

}