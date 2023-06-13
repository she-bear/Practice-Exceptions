package Seminar_1;

public class Task_2 {

    public static void main(String[] args) {
        int array_task21[][] = {{0, 1, 0, 1}, {0, 1, 1, 0}, {1, 0, 1, 1}, {0, 0, 1, 1}};
        int sum_2 = arraySum(array_task21);
        System.out.println(sum_2);

        int array_task2[][] = {{0, 1, 0, 2}, {0, 3, 1, 0}, {1, 0, 1, 1}, {0, 0, 1, 1}};
        int sum = arraySum(array_task2);
        System.out.println(sum);
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