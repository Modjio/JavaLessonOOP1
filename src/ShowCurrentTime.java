public class ShowCurrentTime {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println("С 1 января 1070 года прошло " + date.getTime() + " миллисекунд.");
        System.out.println("На дворе: " + date);
    }
}
