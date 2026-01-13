package JAVA_260113;

import java.util.Scanner;

public class Suup_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*정수 2개 입력받아서 몫과 나머지 출력하기*/
        System.out.print("정수1 : ");
        int a = scanner.nextInt();

        System.out.print("정수2 : ");
        int b = scanner.nextInt();

        System.out.println("=======================");
        System.out.println("몫 : " + (a / b));
        System.out.println("나머지 : " + (a % b));
        System.out.println("=======================");


        scanner.close();
    }
    }

