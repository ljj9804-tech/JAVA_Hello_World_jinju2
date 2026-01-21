package JAVA_260121;

import java.util.HashMap;

public class A03_HashMap_Test {
    public static void main(String[] args) {

        HashMap<String, Integer> menuMap = new HashMap<>();

        menuMap.put("김밥", 3000);
        menuMap.put("라면", 4500);
        menuMap.put("떡볶이", 5000);

        System.out.println("===전체 출력 1===");
        for (String key : menuMap.keySet()) {
            System.out.println("키 : " + key + "값 : " + menuMap.get(key));
        }

        //라면 가격 출력
        System.out.println("\n라면 가격: " + menuMap.get("라면"));

        //김밥 가벽 3500으로 수정
        menuMap.put("김밥", 3500);
        System.out.println("수정 후 김밥 가격: " + menuMap.get("김밥"));

        //돈까스 메뉴 있는지 확인
        boolean hasKey = menuMap.containsKey("돈까스");
        System.out.println("돈까스 조회 결과" + hasKey);

        System.out.println("\n===전체 출력 2===");
        for (String key : menuMap.keySet()) {
            System.out.println("키 : " + key + "값 : " + menuMap.get(key));
        }

    }
}
