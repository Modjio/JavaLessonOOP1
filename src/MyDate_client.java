public class MyDate_client {
    public static void main(String[] args) {

        MyDate md1 = new MyDate();
        new MyDate(2734567890123L);
        new MyDate(2020,10,30);

        System.out.print(md1.getYear() + ".");
        System.out.print(md1.getMonth() + ".");
        System.out.print(md1.getDay());

        System.out.println("\nУвеличиваем время");

        md1.setDate(10000000000L);

        System.out.print(md1.getYear() + ".");
        System.out.print(md1.getMonth() + ".");
        System.out.print(md1.getDay());
    }
}
