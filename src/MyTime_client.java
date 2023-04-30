public class MyTime_client {
    public static void main(String[] args) {
        MyTime myTime1 = new MyTime();
        MyTime myTime2 = new MyTime(555550000);
        MyTime myTime3 = new MyTime(13,22,45);

        System.out.println();

        System.out.println(myTime1.getHour());
        System.out.println(myTime2.getHour());
        System.out.println(myTime3.getHour());
    }
}
