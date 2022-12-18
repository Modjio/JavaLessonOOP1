public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch sw1 = new StopWatch();

        System.out.println("Время начала выполнения программы - " + sw1.getStartTime());

        // создаём массив на 100 000 чисел
        int[] array = new int[100000];

        // заполняем массив случайно сгенерированными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        // выводим НЕ сортированный массив
        System.out.println("Выводим наш не отсортированный массив:");
        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println("\nСортируем массив");
        runSort(array);

        System.out.println("Выводим наш отсортированный массив:");
        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println("\nВремя окончания выполнения программы - " + sw1.getEndTime());

        System.out.println("\nПрограмма выполнялась - " + sw1.getElapsedTime() + " мс.");
    }

    static void runSort(int[] list) {
        int temp;
        for (int i = 0; i < list.length; i++) {     // сравниваем первое значение с остальными, после +1
            for (int j = i + 1; j < list.length; j++) {     // пошагово сравниваем весь массив с первым значением
                if (list[i] > list[j]) {    // если первое значение больше, то меняем местами
                    temp = list[i];         // используя переменную темп
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
