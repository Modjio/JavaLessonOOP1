/*Задание №11
        Найдите первые 10 чисел с 50 десятичными цифрами, которые кратны 2 или 3.*/

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {

        int count = 0;
        int firstTen = 10;   //  сколько необходимо найти чисел?
        int lastTen = 50;   //  из скольки чисел?

        Random generator1 = new Random();

        int[] myArray = new int[lastTen];

        System.out.println("Результат генерации:");
        for (int i = 0; i < lastTen; i++) {
            myArray[i] = generator1.nextInt(1000);
            System.out.print(myArray[i] + " ");
        }

        System.out.println("\nВывод:");

        for (int j : myArray) {
            if (count < firstTen) {
                if (j % 2 == 0 || j % 3 == 0) {
                    System.out.print(j + " ");
                    count++;
                }
            }
        }
    }
}
