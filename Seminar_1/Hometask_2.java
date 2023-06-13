package Seminar_1;

public class Hometask_2 {
    public static void main(String[] args) {
        String in_array_1[][] = {{"1", "1", "1", "0", "1"}, {"0", "1", "1", "0", "1"}};
        System.out.println(sum2d(in_array_1));

        // ArrayIndexOutOfBoundsException
        String in_array_2[][] = {{"0", "1"}, {"0", "1"}, {"1", "0"}, {"0", "0"}};
        System.out.println(sum2d(in_array_2));

        // NullPointerException
        String in_array_3[][] = null;
        sum2d(in_array_3);
        // или
        String in_array_4[][] = {null, {"0", "1", "1", "0", "1"}};
        System.out.println(sum2d(in_array_4));

        // NumberFormatException
        String in_array_5[][] = {{"0", "1", "be-be-be", "0", "1"}, {"0", "1", "1", "0", "1"}};
        System.out.println(sum2d(in_array_5));  
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
