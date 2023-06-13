package Seminar_1;

import java.util.Scanner;

public class Hometask_1 {
    public static void main(String[] args) {
        int[] my_array = new int []{1, -2, 3, -4, 5, -6, 7, -8, 9, -10};

        // case 1
        try {
            System.out.println(SumByIndex(my_array, 5));
        } catch (IndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }

        try {
            System.out.println(SumByIndex(my_array, 10));
        } catch (IndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }

        // case 2
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Input speed value: ");
        int speed_in = iScanner.nextInt();
        System.out.print("Input time value: ");
        int time_in = iScanner.nextInt();
        try {
            System.out.println("Distance value:" + getDistance(speed_in, time_in));
        } catch (IllegalArgumentException exc) {
            System.out.println(exc.getMessage());
        }

        // case 3
        String str_in = "Two merry geese lived with granny";
        try {
            System.out.println(getChar(str_in, 100));
        } catch (StringIndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }

        try {
            System.out.println(getChar(str_in, 32));
        } catch (StringIndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }

        iScanner.close();
    }

    // суммируем первые index элементов массива
    public static int SumByIndex(int[] in_array, int index) {
        int sum = 0;

        // если задан недопустимый индекс - exception
        if (index > in_array.length - 1) {
            throw new IndexOutOfBoundsException("Index is more then array's length!");
        } else {
            for (int i = 0; i < in_array.length; i++) {
                sum += in_array[i];
            }
        }

        return sum;
    }

    // вычисление расстояния по скорости и времени
    public static int getDistance(int speed, int time) {
        // если заданы отрицательные величины - exception Speed and time must be positive!
        if (speed < 0 || time < 0) {
            throw new IllegalArgumentException("Speed and time must be positive!");
        } else {
            return speed * time;
        }
    }

    // получение символа из строки по номеру
    public static char getChar(String str, int index){
        if (index > str.length() - 1){
            throw new StringIndexOutOfBoundsException("Char index is more then string's length!");
        } else {
            return str.charAt(index);
        }
    }
}
