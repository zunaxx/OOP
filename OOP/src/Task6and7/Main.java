package Task6and7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Иванов", LocalDate.of(2000, 5, 15), "1234567890", "Россия");
        students[1] = new Student("Петров", LocalDate.of(1999, 8, 22), "9876543210", "Украина");
        students[2] = new Student("Сидоров", LocalDate.of(2001, 3, 10), "5555555555", "Беларусь");
        students[3] = new Student("Коваленко", LocalDate.of(1998, 11, 7), "9999999999", "Украина");
        students[4] = new Student("Марков", LocalDate.of(2002, 7, 3), "7777777777", "Россия");

        for (Student student : students) {
            System.out.println(student);
            System.out.println("Возраст: " + student.getAge() + " лет");
            System.out.println();
        }
    }
}
