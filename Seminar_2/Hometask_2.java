package Seminar_2;

public class Hometask_2 {
    public static void main(String[] args) {
        
        // добавили объявление массива
        int intArray[] = {0, -1, 2, -3, 4, -5, 6, -7, 8, -9, 10};

        try {
            // поменяли на d = 4, иначе код ВСЕГДА вызывает исключение
            int d = 4;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        // добавили проверку на выход на пределы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
