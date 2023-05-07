import java.util.Arrays;
import java.util.Objects;

public class Course {
    private final String courseName;
    private String[] students = new String[1];
    private int numberOfStudents = 0;

    //  курс
    public Course(String courseName) {
        this.courseName = courseName;
    }

    //  получение названия курса
    public String getCourseName() {
        return courseName;
    }

    //  получение списка студентов курса
    public String[] getStudents() {
        return students;
    }

    //  получить количество студентов курса
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    //  Добавление студента на курс
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;

        //  если массив переполняется
        if (numberOfStudents >= students.length) {
            String[] studentsTemp = new String[students.length * 2]; //  создаём массив увеличенный в 2 раза
            System.arraycopy(students, 0, studentsTemp, 0, students.length);    //  копируем в него
            students = studentsTemp;    //  присваем ссылку на массив
        }
    }

    //  Отчисление конкртного студента с курса
    public void dropStudent(String student) {
        // найти студента по имени
        for (int i = 0; i < students.length; i++) {
            if (Objects.equals(students[i], student)) { // опеделить его ИД
//                students[i] = null; // удалить этот ИД, но появляются null ячейки
                students[i] = students[numberOfStudents - 1]; //  присвоить "удаляемой" ячейке последнее значение (-1 - до сдвига каретки)
                students[numberOfStudents - 1] = null;    //  дропаем последнее значение (-1 - до сдвига каретки)
                numberOfStudents--; //  уменьшаем значение количества студентов на курсе
            }
        }
    }

    //  удаление всех студентов с дисциплины
    public void clear() {
        Arrays.fill(students, null);    //  заполняем массив null`ами
        numberOfStudents = 0;   //  присваиваем значение количество студентов 0
    }
}
