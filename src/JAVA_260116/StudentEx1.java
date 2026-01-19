package JAVA_260116;

public class StudentEx1 {
    String name;
    int score;

    public StudentEx1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    //  객체 배열을 반환하는 메소드 만들기
    //  메소드명 : createStudents
    //  반환타입: StudentEx1
    //  이용해보기.
    StudentEx1[] createStudents() {
        return  new StudentEx1[] {
                new StudentEx1("학생1",95),
                new StudentEx1("학생2",90),
                new StudentEx1("학생3",85)
        };
    }

} //class
