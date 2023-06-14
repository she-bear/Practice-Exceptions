package Seminar_2;

public class Hometask_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            
            printSum(23, 234);
            
            // abc[3] -> abc[2], т.к. иначе ошибка будет всегда (но будет обрабатываться IndexOutOfBoundsException)
            int[] abc = { 1, 2 };
            abc[1] = 9;

        // меняем местами блоки, чтобы catch Throwable стоял в конце
        // (перехват исключений из подклассов должен следовать до перехвата исключений из суперклассов)
        // блок catch (NullPointerException ex) - убираем, т.к. здесь не может вокникнуть ситуации, которая бы потребовала обработки на null7
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");    
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    
    // метод не работает с файлами, убираем throws FileNotFoundException
    // но можно заменить на ArithmeticException на случай, если эту функцию в дальнейшем понадобится усложнить
    public static void printSum(Integer a, Integer b) throws ArithmeticException {
        System.out.println(a + b);
    }

}
