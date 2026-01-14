package JAVA_260114;

public class SUUP_1 {
    public static void main(String[] args) {

        //조건문 if, switch

        //기본예시
        int temp = 35;
        if (temp > 30) {
            System.out.println("더움");
        }

        int month = 4;
        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            default:
                System.out.println("기타 계절");
        }

        //Test_1 완=============================================

        //반복문 for, while, do-while

        //기본예시
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;
            System.out.println(i);
        }

        //Test_2 완=============================================




    } //main
} //class
