package homework.students;

import homework.students.command.Commands;
import homework.students.model.Lesson;
import homework.students.model.Student;
import homework.students.storage.LessonStorage;
import homework.students.storage.StudentStorage;

import java.util.Scanner;

import static homework.students.command.Commands.*;

public class StudentDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson java = new Lesson("Java", "teacher name 1", 300, 44);
        lessonStorage.add(java);
        Lesson java_script = new Lesson("Java script", "teacher name 2", 300, 44);
        lessonStorage.add(java_script);
        Lesson mysql = new Lesson("mysql", "teacher name 3", 300, 44);
        lessonStorage.add(mysql);

        studentStorage.add(new Student("Alina", "Hakobyan", 19, "123456", "Gyumri", java));
        studentStorage.add(new Student("Ariana", "Hakobyan", 19, "123456", "Gyumri", java_script));
        studentStorage.add(new Student("Elina", "Hakobyan", 19, "123456", "Gyumri", mysql));
        boolean run = true;
        while (run) {
            printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case Commands.ADD_STUDENT:
                    addStudent();
                    break;
                case Commands.PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case Commands.PRINT_STUDENTS_COUNT:
                    studentStorage.getSize();
                    break;
                case Commands.DELETE_STUDENT_BY_INDEX:
                    deleteStudentByIndex();
                    break;
                case Commands.PRINT_STUDENT_BY_LESSON:
                    searchStudentByLessonName();
                    break;
                case Commands.PRINT_STUDENT_LESSON:
                    changeStudentLesson();
                    break;
                case Commands.ADD_LESSON:
                    addLesson();
                    break;
                case Commands.PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command, please try again");

            }
        }
    }

    private static void addLesson() {
        System.out.println("Please input lesson name:");
        String name = scanner.nextLine();

        System.out.println("Please input lesson price:");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Please input lesson duration by month:");
        int duration = Integer.parseInt(scanner.nextLine());

        System.out.println("Please input lesson teacher name:");
        String teacherName = scanner.nextLine();

        Lesson lesson = new Lesson(name, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("Lesson created!");
    }

    private static void searchStudentByLessonName() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLesson(lessonName);
    }

    private static void deleteStudentByIndex() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }

    private static void changeStudentLesson() {
        studentStorage.print();
        System.out.println("Please choose student index:");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student != null) {
            lessonStorage.print();
            System.out.println("Please choose lesson index:");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("Please input correct index:");
                changeStudentLesson();
            } else {
                student.setLesson(lesson);
                System.out.println("Lesson changed!");
            }
        } else {
            System.out.println("Invalid index, please try again.");
            changeStudentLesson();
        }
    }

    private static void addStudent() {
        lessonStorage.print();
        if (lessonStorage.getSize() == 0) {
            System.out.println("Please add lesson:");
        } else {
            lessonStorage.print();
            System.out.println("Please choose lesson index:");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("Please input correct index:");
                addStudent();
            } else {
                System.out.println("Please input student's name");
                String name = scanner.nextLine();
                System.out.println("Please input student's surname");
                String surname = scanner.nextLine();
                System.out.println("Please input student's age");
                String ageStr = scanner.nextLine();
                System.out.println("Please input student's phoneNumber");
                String phoneNumber = scanner.nextLine();
                System.out.println("Please input student's city");
                String city = scanner.nextLine();
                System.out.println("Please input student's lesson");

                int age = Integer.parseInt(ageStr);
                Student student = new Student(name, surname, age, phoneNumber, city, lesson);

                studentStorage.add(student);
                System.out.println("Thank you, student added.");
            }
        }

    }
}
