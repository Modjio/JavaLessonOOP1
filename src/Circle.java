// Определение класса круга с двумя конструкторами
class Circle {
    private static int numberOfObjects = 0; // количество созданных объектов
    private double radius;

    /**
     * Создает круг с радиусом, равным 1
     */
    Circle() {
        radius = 1.0;
        numberOfObjects++;
    }

    /**
     * Создает круг с указанным радиусом
     */
    Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /**
     * Возвращает площадь этого круга
     */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Возвращает периметр этого круга
     */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Присваивает новый радиус этому кругу
     */
    void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /**
     * Возвращает радиус
     */
    double getRadius() {
        return radius;
    }

    /**
     * Возвращает количество созданных объектов
     */
    static int getNumberObjects() {
        return numberOfObjects;
    }
}