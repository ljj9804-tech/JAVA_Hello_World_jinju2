package JAVA_260121;

import java.util.ArrayList;

public class A01_ArrayList_Test {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add ("홍길동");
        studentList.add ("이순신");
        studentList.add ("강감찬");

        System.out.println("리스트의 두 번째 사람 : " + studentList.get(1));

        studentList.set(2,"을지문덕");
        studentList.remove(0);

        System.out.println();
        System.out.println("리스트 크기 출력");
        System.out.println(studentList.size());

        System.out.println();
        System.out.println("리스트에 남은 사람 모두 출력");
        for (String list : studentList) {
            System.out.println(list);
        }




    }
}
