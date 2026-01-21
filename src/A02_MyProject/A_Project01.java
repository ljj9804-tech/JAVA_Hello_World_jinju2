package A02_MyProject;

import java.util.ArrayList;

public class A_Project01 {
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        //==========================
        studentList.add("학생1");
        studentList.add("학생2");
        studentList.add("학생3");
        studentList.add("학생4");

        //==========================
        scores.add(90);
        scores.add(80);
        scores.add(95);
        scores.add(100);

        //==========================

        System.out.println("=====학생 리스트=====");
        System.out.println("등록된 학생 수: "+studentList.size());
        for (int i = 0; i < studentList.size(); i++) {
            String name = studentList.get(i);
            Integer score = scores.get(i);
            System.out.println("이름: " + name + " / 점수: " + score);
        }
        //==========================

        int total = 0;
        for (int s : scores) {
            total += s;
        }
        double avg = (double) total/ studentList.size();

        System.out.println("\n=====성적 통계=====");
        System.out.println("총점 :" + total + "점");
        System.out.println("전체 평균 :" + avg + "점");
        //==========================






        System.out.println("\n여기까지 확인 완====================");







    } //main
}
