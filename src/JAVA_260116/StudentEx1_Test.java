package JAVA_260116;

public class StudentEx1_Test {
    public static void main(String[] args) {
        StudentEx1[] arr = {
                new StudentEx1("김일일",90),
                new StudentEx1("박이이",95),
                new StudentEx1("이삼삼",85)
        };

        for (StudentEx1 i : arr) {
            if (i.score >= 90) {
            System.out.println("이름: " + i.name + " 점수: " + i.score);
            }
        }

        System.out.println("==============================");


        System.out.println("실습2, 학생 요소를 가지는 배열을 반환하는 기능 이용. ");

        // 현재, 배열을 생성하는 기능은 StudentEx1 클래스에 있음.
        StudentEx1 studentEx1 = new StudentEx1("학생이름",0);
        StudentEx1[] arr2  = studentEx1.createStudents();
        for(StudentEx1 student :arr2) {
            System.out.println("이름 : " + student.name + ", 점수 : " +student.score);
        }

    } //main
}
