public class MyInteger {
    int value;  // в котором хранится целочисленное значение, представленное этим объектом

//    public MyInteger() {
//    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getMyInteger() {
        return value;
    }

    //    если число делится на 2, число чётноё - выводим true
    public boolean isEven() {
        return value % 2 == 0;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    //    если число НЕ делится на 2, число не чётноё - выводим true
    public boolean isOdd() {
        return value % 2 != 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    //    число просто если больше нуля и делится на 1 без остатка
    public boolean isPrime() {
        return value > 0 && value % 1 == 0;
    }

    public static boolean isPrime(int value) {
        return value > 0 && value % 1 == 0;
    }

    //      проверка на равенство
    public boolean isEquals(int i) {
        return value == i;
    }

    //      преобразует массив числовых символов в значение типа int
    public int parseInt(char[] array) {
        int sumArray = 0;
        for (char c : array) {      // итерируем по массиву и
            sumArray += Character.getNumericValue(c);       //  сладываем значения
        }
        return sumArray;
    }

    //      преобразует строку в значение типа int
    public int parseInt(String str) {
        int val;
        val = Integer.parseInt(str);
        return val;
    }
}
