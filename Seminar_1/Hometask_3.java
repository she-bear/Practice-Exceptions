package Seminar_1;

import java.util.Arrays;

public class Hometask_3 {
    public static void main(String[] args) {
        int[] array_1 = new int []{10, 20, 30};
        int[] array_2 = new int []{5, 2, 6};

        System.out.println(Arrays.toString(getArrayDivision(array_1, array_2)));

        
        int[] array_3 = new int []{10, 20};
        int[] array_4 = new int []{5, 2, 6};

        System.out.println(Arrays.toString(getArrayDivision(array_3, array_4)));
    }

    public static int[] getArrayDivision(int[] array_in_1, int[] array_in_2) {
        
        if (array_in_1.length != array_in_2.length) {
            throw new RuntimeException("Array's 1 length not equal to array's 2 length!");
        }

        int[] array_div = new int[array_in_1.length];

        for (int i = 0; i < array_in_1.length; i++) {
            if (array_in_2[i] == 0) {
                throw new RuntimeException("ArithmeticException: division by zero!");
            } else {
                array_div[i] = array_in_1[i] / array_in_2[i];
            }
        }

        return array_div;
    }
}
