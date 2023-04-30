public class MyTime {

    public MyTime() {
        // Екатеринбург
        int timeZone = 5;
        System.out.println(
                System.currentTimeMillis() / 1000 / 60 / 60 % 24 + timeZone + ":" +
                        System.currentTimeMillis() / 1000 / 60 % 60 + ":" +
                        System.currentTimeMillis() / 1000 % 60
        );
    }

    public MyTime(long time) {
        System.out.println(
                time / 1000 / 60 / 60 % 24 + ":" +
                        time / 1000 / 60 % 60 + ":" +
                        time / 1000 % 60
        );
    }

    public MyTime(int hour, int minute, int second) {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public long setTime(long elapseTime) {
        return System.currentTimeMillis() - elapseTime; // времянка, тут должно быть что-то другое
    }

    /* Возвращаем значение часа*/
    public long getHour() {
        return System.currentTimeMillis() / 1000 / 60 / 60 % 24;
    }

    /* Возвращаем значение минут */
    public long getMinute() {
        return System.currentTimeMillis() / 1000 / 60 % 60;
    }

    /* Возвращаем значение секунд */
    public long getSecond() {
        return System.currentTimeMillis() / 1000 % 60;
    }
}
