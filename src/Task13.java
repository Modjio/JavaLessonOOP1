/*Задание 13.
        Напишите программу, которая находит 5 простых чисел, которые больше Long.MAX_VALUE.*/

import java.math.BigDecimal;

public class Task13 {
    public static void main(String[] args) {
        long n = 0;
        int count = 0;

        System.out.println(Long.MAX_VALUE);

        //  запускаем цикл на 5 раз
        while (count < 5) {
            //  т.к. значение больше лонга будет отрицательным, переводим лонг в биг дэцимал
            BigDecimal a = new BigDecimal(Long.MAX_VALUE);
            //  напрямую с лонгом add не работает, по тому тоже делаем децимал
            BigDecimal c = new BigDecimal(n);
            //  складываем
            BigDecimal b = a.add(c);
            if (b.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                System.out.println(b);  //  выводим
                count++;    //  увеличиваем счётчик цикла
            }
            n++;    //  увеличиваем значение лонга
        }
    }
}
