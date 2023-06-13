package Seminar_1;

public class Task_0 {

    public static void main(String[] args) {
        int[] array = new int []{1, 2, 3, 4};
        int a = ex0(array);
        if (a == -1)
            System.out.println("Return -1");
        else {

        };
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
}