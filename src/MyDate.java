import java.util.GregorianCalendar;

public class MyDate {

    //  Поля данных year, month и day, которые представляют дату. Поле month должно быть основано на числе, т.е. 0 — для января, 1 — для февраля и т.д.
    private int year;
    private int month;
    private int day;

    //  Безаргументный конструктор, который создает объект типа MyDate для текущей даты.
    public MyDate() {
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        System.out.println("Год: " + gregorianCalendar1.get(GregorianCalendar.YEAR) + ". Месяц: " + gregorianCalendar1.get(GregorianCalendar.MONTH) +
                ". День: " + gregorianCalendar1.get(GregorianCalendar.DAY_OF_MONTH) + ".");
    }

    //  Конструктор, который создает объект типа MyDate с указанным временем в миллисекундах, прошедших с 00:00, 1 января 1970 г.
    public MyDate(long time) {
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(time);
        System.out.println("Год: " + gregorianCalendar2.get(GregorianCalendar.YEAR) + ". Месяц: " + gregorianCalendar2.get(GregorianCalendar.MONTH) +
                ". День: " + gregorianCalendar2.get(GregorianCalendar.DAY_OF_MONTH) + ".");
    }

    //  Конструктор, который создает объект типа MyDate с указанными годом, месяцем и днем.
    public MyDate(int year, int month, int day) {
        GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
        gregorianCalendar3.set(year, month, day);
        System.out.println("Год: " + gregorianCalendar3.get(GregorianCalendar.YEAR) + ". Месяц: " + gregorianCalendar3.get(GregorianCalendar.MONTH) +
                ". День: " + gregorianCalendar3.get(GregorianCalendar.DAY_OF_MONTH) + ".");
    }

    //  Три getter-метода для полей данных year, month и day, соответственно.
    public int getYear() {
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        return gregorianCalendar1.get(GregorianCalendar.YEAR);
    }

    public int getMonth() {
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        return gregorianCalendar1.get(GregorianCalendar.MONTH);
    }

    public int getDay() {
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        return gregorianCalendar1.get(GregorianCalendar.DAY_OF_MONTH);
    }

    //  Метод с именем setDate(long elapsedTime), который присваивает новую дату объекту, используя прошедшее время.
    public void setDate(long elapsedTime) {
        GregorianCalendar gregorianCalendar4 = new GregorianCalendar();
        gregorianCalendar4.setTimeInMillis(elapsedTime);    //  сильно не уверен что это делается так...
    }

}
