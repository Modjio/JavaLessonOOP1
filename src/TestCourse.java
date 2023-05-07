public class TestCourse {
    public static void main(String[] args) {
        //  создание курсов
        Course course1 = new Course("К1. Основы высшей математики");
        Course course2 = new Course("К2. Алгебра и геометрия");

        //  добавляем студентов на курс
        course1.addStudent("Иванов Жордан Львович");
        course1.addStudent("Смирнов Иоан Игоревич");
        course1.addStudent("Саптыкморжингаев Олег Кымчинокович");

        course2.addStudent("Саптыкморжингаев Олег Кымчинокович");
        course2.addStudent("Петров Игорь Витальевич");

        //  формирование массива из списка студентов
        String[] students = course1.getStudents();
//        String[] students2 = course2.getStudents();

        //  вывод информации по студентам курса
        System.out.print("На курсе \"" + course1.getCourseName() + "\" студентов зачислено: " + course1.getNumberOfStudents() + ". Состав: ");
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
//        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + ", ");
        }

        System.out.println();

        System.out.print("На курсе \"" + course2.getCourseName() + "\" студентов зачислено: " + course2.getNumberOfStudents() + ".");
//        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
//            System.out.print(students2[i] + ", ");
//        }

        //  отчисление студента
        course1.dropStudent("Смирнов Иоан Игоревич");
        course1.dropStudent("Иванов Жордан Львович");

        course1.addStudent("Джон Смит Сергеевич");

        //  вывод списка с учётом удаленного студента
        System.out.println();
        System.out.print("На курсе \"" + course1.getCourseName() + "\" студентов зачислено: " + course1.getNumberOfStudents() + ". Состав: ");
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
//        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + ", ");
        }

        //  удаление всех с курса
        course1.clear();

        //  вывод списка с учётом удаленного студента
        System.out.println();
        System.out.print("На курсе \"" + course1.getCourseName() + "\" студентов зачислено: " + course1.getNumberOfStudents() + ". Состав: ");
        for (int i = 0; i < course1.getNumberOfStudents() + 1; i++) { //  +1 указано специально, что бы показать значение null
//        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + ", ");
        }

    }
}
