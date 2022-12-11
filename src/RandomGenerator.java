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

    }
}
