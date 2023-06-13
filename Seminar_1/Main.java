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

        // Задача 2
        int array_task2[][] = {{0, 1, 0, 2}, {0, 3, 1, 0}, {1, 0, 1, 1}, {0, 0, 1, 1}};
        int sum = arraySum(array_task2);
        System.out.println(sum);

        int array_task21[][] = {{0, 1, 0, 1}, {0, 1, 1, 0}, {1, 0, 1, 1}, {0, 0, 1, 1}};
        int sum_2 = arraySum(array_task21);
        System.out.println(sum_2);
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

    // Задача 2: метод, принимающий целочисленный двумерный массив
    // посчитать и вернуть сумму элементов массива
    // метод может работать ТОЛЬКО с квадратными массивами, и в каждой ячейке может лежать только 0 или 1
    // если нарушается одно из условий, то бросить Runtime Exception
    public static int arraySum(int arr[][]) {
        int sum = 0;

        if (arr.length != arr[0].length) {
            throw new RuntimeException("Length is not equal then width");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    throw new RuntimeException("Array contains items not equal 0 or 1");
                }
                sum += arr[i][j];
            }    
        }
        return sum;
    }
}