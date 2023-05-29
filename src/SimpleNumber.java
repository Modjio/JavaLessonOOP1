/* Простое число.
перебор чисел в цикле и проверка числа на простоту
 */

public class SimpleNumber {
    public static void main(String[] args) {
        int number = 3;
        boolean simple;

        for (int i = 0; i < 20; i++) {
            simple = true;

            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.println(number);
            }
            number++;
        }
    }
}
