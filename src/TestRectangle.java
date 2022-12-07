public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle0 = new Rectangle();
        System.out.println("Квадрат 0. Ширина " + rectangle0.width + ". Высота " + rectangle0.height +
                ". Площадь " + rectangle0.getArea() + ". Периметр " + rectangle0.getPerimeter());

        Rectangle rectangle1 = new Rectangle(4, 40);
        System.out.println("Квадрат 1. Ширина " + rectangle1.width + ". Высота " + rectangle1.height +
                ". Площадь " + rectangle1.getArea() + ". Периметр " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("Квадрат 1. Ширина " + rectangle2.width + ". Высота " + rectangle2.height +
                ". Площадь " + rectangle2.getArea() + ". Периметр " + rectangle2.getPerimeter());
    }
}
