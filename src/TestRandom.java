import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random1 = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(random1.nextInt(100) + " ");
        }
    }
}
