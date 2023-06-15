package Seminar_3;

import java.util.Date;
import java.text.SimpleDateFormat;
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

            checkUserData(user_data);

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

    // проверка исходных данных на корректность
    public static void checkUserData(String[] in_data) {

        // проверка ФИО
        for (int i = 0; i < 3; i++) {
            if (!in_data[i].matches("^[a-zA-Zа-яА-Я]+$")) {
                throw new RuntimeException("Invalid name format!");
            }
        }

        // проверка даты рождения
        try {
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(in_data[3]);
        } catch (Exception exc) {
            throw new RuntimeException("Invalid date format!");
        }

        // проверка номера телефона
        try {
             long phone = Long.parseLong(in_data[4]);
        } catch (Exception exc) {
            throw new RuntimeException("Invalid phone format!");
        }

        // проверка gender
        if (!(in_data[5].equals("f") | in_data[5].equals("m"))) {
            throw new RuntimeException("Invalid gender value!");
        }
    }
}
