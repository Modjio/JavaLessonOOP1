public class Location {
    public static int row, column;
    public static double maxValue;

    /**
     * Метод поиска наибольшего значения в двумерном массиве и его позиция
     */
    public static void locateLargest(double[][] a) {
        maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maxValue <= a[i][j]) {  // if <= - find max value. if >= - find min value
                    maxValue = a[i][j];     // assign max value
                    row = i;                // assign number row
                    column = j;             // assign number columns
                }
            }
        }
    }
}
