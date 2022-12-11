import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {

        /*
         * equals seed
         */
        Random generator1 = new Random(3);
        System.out.print("Результат 1 генерации: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(generator1.nextInt(1000) + " ");
        }

        Random generator2 = new Random(3);
        System.out.print("\nРезультат 2 генерации: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(generator2.nextInt(1000) + " ");
        }

        /*
         * repeat gen equals seed
         */
        System.out.print("\nПовтор результата 1 генерации: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(generator1.nextInt(1000) + " ");
        }

        System.out.print("\nПовтор результата 2 генерации: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(generator2.nextInt(1000) + " ");
        }

        /*
         * other randomize type
         */

        Random generator3 = new Random(10);
        System.out.print("\nДругие виды:");
        System.out.print("\nСлучайное значение типа int: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(generator2.nextInt() + " ");
        }
        System.out.print("\nСлучайное значение от 0 до n: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(generator3.nextInt(10) + " ");
        }
        System.out.print("\nСлучайное значение типа long: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(generator2.nextLong() + " ");
        }
        System.out.print("\nСлучайное значение типа boolean: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(generator3.nextBoolean() + " ");
        }
    }
}
