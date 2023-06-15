package Seminar_2;

import java.util.Scanner;

public class Hometask_4 {
    public static void main(String[] args) {
        try {
            System.out.println("String is: " + getString());
        } catch (RuntimeException exc) {
            System.out.println(exc.getMessage());
        }

    }

    public static String getString() {
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Input string: ");
        String in_str = iScanner.nextLine();
        if (in_str.length() == 0) {
            throw new RuntimeException("Error: string is empty!");
        }

        iScanner.close();
        return in_str;
    }
}
