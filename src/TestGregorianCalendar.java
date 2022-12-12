import java.util.GregorianCalendar;

public class TestGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        /*
         * 1
         */
        System.out.println("Год: " + gregorianCalendar1.get(GregorianCalendar.YEAR) + ". Месяц: " + gregorianCalendar1.get(GregorianCalendar.MONTH) +
                ". День: " + gregorianCalendar1.get(GregorianCalendar.DAY_OF_MONTH) + ".");

        /*
         * 2
         */
        gregorianCalendar1.setTimeInMillis(1234567898765L);
        System.out.println("Год: " + gregorianCalendar1.get(GregorianCalendar.YEAR) + ". Месяц: " + gregorianCalendar1.get(GregorianCalendar.MONTH) +
                ". День: " + gregorianCalendar1.get(GregorianCalendar.DAY_OF_MONTH) + ".");
    }
}
