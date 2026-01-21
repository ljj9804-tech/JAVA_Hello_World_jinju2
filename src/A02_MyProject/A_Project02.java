package A02_MyProject;

import java.util.HashMap;

public class A_Project02 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("학생1", 85);
        studentMap.put("학생2", 90);
        studentMap.put("학생3", 100);
        studentMap.put("학생4", 95);
        //==============================

        System.out.println("학생 리스트");
        System.out.println("등록된 학생 수: " + studentMap.size());
        for(String nameKey : studentMap.keySet()) {
            System.out.println("이름: " + nameKey + " | 점수: " + studentMap.get(nameKey));
        }
        //==============================

        int total = 0;
        for(int score : studentMap.values()) {
            total += score;
        }
        double avg = (double)total/ studentMap.size();

        System.out.println();
        System.out.println("점수 총점: " + total);
        System.out.println("점수 평균: " + avg);
        //==============================
    }
}
