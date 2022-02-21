import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Student> getStudentsList() {
        Course course1 = new Course("python");
        Course course2 = new Course("java");
        Course course3 = new Course("javascript");
        Course course4 = new Course("pascal");
        Course course5 = new Course("html");
        Course course6 = new Course("ruby");
        Course course7 = new Course("c");
        Course course8 = new Course("c++");
        Course course9 = new Course("c#");
        Course course10 = new Course("php");


        Student student1 = new Student("Ivan", Arrays.asList(course1, course3, course5));
        Student student2 = new Student("Aleksandr", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Anastasiya", Arrays.asList(course1, course7, course11));
        Student student4 = new Student("Dmitriy", Arrays.asList(course2, course4, course8, course1, course3, course5));
        Student student5 = new Student("Oleg", Arrays.asList(course3, course7, course9));
        Student student6 = new Student("Vladislav", Arrays.asList(course1, course3, course5, course9));
        Student student7 = new Student("Artem", Arrays.asList(course2, course6, course7, course5, course9));
        Student student8 = new Student("Andrey", Arrays.asList(course3, course2, course4));
        Student student9 = new Student("Olga", Arrays.asList(course4, course8, course5));
        Student student10 = new Student("Marina", Arrays.asList(course5, course1, course9));
        Student student11 = new Student("Ruslan", Arrays.asList(course6, course9, course5));
        Student student12 = new Student("Petr", Arrays.asList(course7, course6, course5));
        Student student13 = new Student("Vladimir", Arrays.asList(course8, course1, course5));
        Student student14 = new Student("Aleksey", Arrays.asList(course9, course2, course5));
        Student student15 = new Student("Darya", Arrays.asList(course10, course3, course1, course2));
        Student student16 = new Student("Ekaterina", Arrays.asList(course11, course9, course2));
        Student student17 = new Student("Denis", Arrays.asList(course12, course8, course3));
        Student student18 = new Student("Pavel", Arrays.asList(course11, course7, course4));
        Student student19 = new Student("Julia", Arrays.asList(course10, course6, course5));
        Student student20 = new Student("Elena", Arrays.asList(course9, course5, course3));



        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
                student8, student9, student10, student11, student12, student13, student14,
                student15, student16, student17, student18, student19, student20);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }

    private static List<Course> getListCourses() {
        return Arrays.asList(new Course("python"),
                new Course("java"),
                new Course("javascript"),
                new Course("pascal"),
                new Course("html"),
                new Course("ruby"),
                new Course("c"),
                new Course("c++"),
                new Course("c#"),
                new Course("php"),
                );
    }
}
