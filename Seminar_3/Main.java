package Seminar_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try {
            System.out.println(Arrays.toString(getUserData()));
        } catch (RuntimeException exc) {
            System.out.println(exc.getMessage());
        }
    }

    // ввод исходных данных
    public static String[] getUserData() {
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Enter data separated by spaces: ");
        String raw_data = iScanner.nextLine();

        String[] split_data;
        split_data = raw_data.split(" ");

        if (split_data.length != 6){
            throw new RuntimeException("Insufficient amount of data!");
        }

        return split_data;
    }
}
