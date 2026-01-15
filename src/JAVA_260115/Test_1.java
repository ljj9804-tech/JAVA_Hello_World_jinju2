package JAVA_260115;


import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {

        //1. 스캐너 도구 이용하기
        Scanner scanner = new Scanner(System.in);


        //2. try 구문 사용(작업 시작하기)

        try {
            System.out.println("숫자를 입력합니다 : ");     //입력 란 만들기
            int number = scanner.nextInt();             //입력한 내용 담기
            System.out.println("입력한 숫자 : " + number);

            //예외 발생 시 넘어오는 구간
        }   catch (Exception e) {
            System.out.println("올바른 숫자를 입력해주세요.");
        }   finally {
            System.out.println("try 구문 종료");
        }

    } //main
} //class

