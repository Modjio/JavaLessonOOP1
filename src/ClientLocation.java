public class ClientLocation {
    public static void main(String[] args) {
        double[][] array = {{750.51, 25.62, 194.93, 591.32, 187.58},
                {21.29, 732.58, 389.84, 237.82, 555.68},
                {340.37, 418.06, 308.55, 143.28, 842.42}};

        System.out.println("Массив задан изначально:");

        // выводим массив (для визуализации)
        for (double[] doubles : array) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + "\t");
            }
            System.out.println();
        }

        // обращаемся к методу в классе
        Location.locateLargest(array);

        // выводим наибольшее значение и его позицию
        System.out.println("Наибольший элемент массива, равный " + Location.maxValue +
                ", находится в позиции (" + Location.row + ", " + Location.column + ").");
    }
}
