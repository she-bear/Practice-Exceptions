package Seminar_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "cp866");
        
        try {
            System.out.print("Enter data separated by spaces: ");
            String raw_data = iScanner.nextLine();
            
            String[] user_data;
            user_data = getUserData(raw_data);

            System.out.println(Arrays.toString(user_data));
        } catch (RuntimeException exc) {
            System.out.println(exc.getMessage());
        }
        finally {
            iScanner.close();
        }
    }

    // ввод исходных данных
    public static String[] getUserData(String in_data) {
        String[] split_data;
        split_data = in_data.split(" ");

        if (split_data.length != 6){
            throw new RuntimeException("Insufficient amount of data!");
        }

        return split_data;
    }
}
