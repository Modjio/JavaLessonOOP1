public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        //  Вывод информации о созданных объектах
        System.out.println("До создания объектов:");
        System.out.println("Количество объектов типа Circle - " + Circle.getNumberObjects() + " шт.");

        //  Создадим объект
        Circle c1 = new Circle();

        //  Вывод информации о созданных объектах
        System.out.println("\nПосле создания c1 объекта:");
        System.out.println("Объект c1. Радиусом " + c1.getRadius() + " Количество объектов типа Circle - " + Circle.getNumberObjects() + " шт.");

        //  Создадим объект
        Circle c2 = new Circle(10);

        //  Вывод информации о созданных объектах
        System.out.println("После создания c2 объекта:");
        System.out.println("Объект c2. Радиусом " + c2.getRadius() + " Количество объектов типа Circle - " + Circle.getNumberObjects() + " шт.");

        //  Вносим изменения в объект
        c1.setRadius(5);

        //  Вывод информации о созданных объектах
        System.out.println("После изменения c1 объекта:");
        System.out.println("Объект c1. Радиусом " + c1.getRadius() + " Количество объектов типа Circle - " + Circle.getNumberObjects() + " шт.");

        System.out.println("\nИтог:");
        System.out.println("Объектов типа Circle - " + Circle.getNumberObjects() + " шт.");
    }

}
