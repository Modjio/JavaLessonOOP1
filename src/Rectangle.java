class Rectangle {
    double width, height;

    /**
     * Квадрат с параметрами по умолчанию
     */
    Rectangle() {
        width = -1;
        height = -1;
    }

    /**
     * Квадрат с заданными параметрами
     */
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    /**
     * Возвращает площадь
     */
    double getArea() {
        return width * height;
    }

    /**
     * Возвращает периметр
     */
    double getPerimeter() {
        return 2 * width + 2 * height;
    }
}
