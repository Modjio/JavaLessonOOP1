import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date4 = new Date(10000);
        Date date5 = new Date(100000);
        Date date6 = new Date(1000000);
        Date date7 = new Date(10000000);
        Date date8 = new Date(100000000);
        Date date9 = new Date(1000000000);
        Date date10 = new Date(10000000000L);
        Date date11 = new Date(100000000000L);

        System.out.println(date4);
        System.out.println(date5);
        System.out.println(date6);
        System.out.println(date7);
        System.out.println(date8);
        System.out.println(date9);
        System.out.println(date10);
        System.out.println(date11);
    }
}
