/*Задание 12.
 *       Найдите первые 10 квадратных чисел, которые больше Long.MAX_VALUE.*/

import java.math.BigDecimal;

public class Task12 {
    public static void main(String[] args) {
        long n = 0;
        int count = 0;

        //  выводим максимальное значение, для ориентировки
        System.out.println(Long.MAX_VALUE);

        //  запускаем цикл на 10 значений
        while (count < 10) {
            BigDecimal a = new BigDecimal(n);   //  большое значение n
            BigDecimal b = a.multiply(a);       //  возводим в квадрам умножением само на себя

            //  сравниваем большое значение с лонгом (результат -1, 0, +1)
            //  и если число больше, то на выходе сравнения будет +1
            if (b.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                System.out.println(b);  //  выводим
                count++;    //  увеличиваем счётчик цикла
            }
            n++;    //  увеличиваем значение лонга
        }
    }
}
