/*Задание 15.
 Найдите первые 10 чисел, больших Long.MAX_VALUE, которые кратны 5 или 6.*/

import java.math.BigDecimal;

public class Task15 {
    public static void main(String[] args) {
        byte count = 0;
        int n = 1;

        // перевести число в больше большего
        BigDecimal a = new BigDecimal(Long.MAX_VALUE);

        // повторяем цикл, пока не найдём 10 чисел
        while (count < 10) {
            BigDecimal c = new BigDecimal(n);
            BigDecimal b = a.add(c);    //  складываем

            // если число делится без остатка на 5 и результат соответствует 0 и это всё равно 0
            if (b.remainder(BigDecimal.valueOf(5)).compareTo(BigDecimal.ZERO) == 0 || b.remainder(BigDecimal.valueOf(6)).compareTo(BigDecimal.ZERO) == 0) {
                System.out.println(b);  //  выводим
                count++;    //  плюсуем счётчик
            }
            n++;    //  увеличиваем значение больше большего
        }
    }
}
