public class MyInteger_client {
    public static void main(String[] args) {
        MyInteger mi = new MyInteger(6);

        System.out.println(mi.getMyInteger());
        System.out.println("Проверка на чётность " + mi.isEven(80));
        System.out.println("Проверка на НЕ чётность " + mi.isOdd(80));
        System.out.println("Проверка на простое число " + mi.isPrime(4));

        System.out.println();
        System.out.println(mi.isEven());
        System.out.println(mi.isOdd());
        System.out.println(mi.isPrime());

        System.out.println();
        System.out.println("Проверка на равенсво " + mi.isEquals(6));
        System.out.println(mi.parseInt(new char[]{'1','2','7'}));
        System.out.println(mi.parseInt("500"));
    }
}
