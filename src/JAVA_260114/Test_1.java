package JAVA_260114;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //실습1-1.
        /*나이를 입력받아 65세 이상이면 "노년층" 출력*/

        System.out.println("나이를 입력합니다 : ");
        int age = scanner.nextInt();

        if (age >= 65) {
            System.out.println("노년층");
        }

        //실습1-2.
//        switch 문으로 메뉴 선택
//        메뉴 번호에 따라서, 음식 메뉴 출력 하기.
//        입력 화면은, 메뉴 화면
//        1. 김밥 2. 국밥 3.칼국수 4.국수 등.
//        예시
//        case 1 김밥, 본인 원하는 메뉴 추가. 출력해보기.


        System.out.println("메뉴를 선택합니다");
        System.out.println("1. 떡볶이");
        System.out.println("2. 파스타");
        System.out.println("3. 샌드위치");
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("떡볶이");
            break;

            case 2:
                System.out.println("파스타");
            break;

            case 3:
                System.out.println("샌드위치");
            break;
        }

        //실습1-3.
        /*점수에 따라 A-F 등급 출력, if문 이용해보기*/

        System.out.println("점수를 입력합니다 :");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("A");
        }   else if (score >= 80) {
            System.out.println("B");
        }   else if (score >= 70) {
            System.out.println("C");
        }   else if (score >= 60) {
            System.out.println("D");
        }   else {
            System.out.println("F");
        }

        scanner.close();

    }
}
