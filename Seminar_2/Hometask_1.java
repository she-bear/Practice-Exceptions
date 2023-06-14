package Seminar_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hometask_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        int exitFlag = 0;
        while (exitFlag == 0) {
            System.out.print("Input float number: ");
            try {
                float f_num = iScanner.nextFloat();
                System.out.println("Your number is: " + f_num);
                exitFlag = 1;
            } catch (InputMismatchException exc) {
                iScanner.next();
                System.out.println("Input error. Please, try again");
                System.out.println();
            }
        }
    }
}
