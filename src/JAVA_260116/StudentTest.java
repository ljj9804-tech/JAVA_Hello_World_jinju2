package JAVA_260116;

public class StudentTest {
    public static void main(String[] args) {
        Student[] studentList = {
                new Student("지민"),
                new Student("정국"),
                new Student("태형"),
        };

        for (Student s : studentList) {
            System.out.println(s.name);
        }


    }
}
