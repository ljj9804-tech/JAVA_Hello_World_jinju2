package JAVA_260113;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //실습3-1.
        System.out.print("나이를 입력합니다 :");
        int age = scanner.nextInt();
        System.out.println("나이 : " + age + "세");

        if (age > 19) {
            System.out.println("성인입니까? : 네");
        }  else {
            System.out.println("성인입니까? : 아니요");
        }


        //실습3-2.
        System.out.print("점수를 입력합니다 : ");
        int score = scanner.nextInt();

        System.out.println("점수 : " + score + "점");

        if (score >= 60) {
            System.out.print("결과 : 합격");
        } else {
            System.out.print("결과 : 불합격");
        }

        scanner.close();

    }
}
