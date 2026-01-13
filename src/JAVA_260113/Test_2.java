package JAVA_260113;

import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        //실습2-1.
        Scanner scanner = new Scanner(System.in);

        System.out.println("오늘 저녁 먹고싶은 메뉴");
        String dinnerMenu = scanner.nextLine();

        System.out.println("어디서 먹을까요?");
        String dinnerLoc = scanner.nextLine();

        System.out.println("저녁 가격 얼마 예상하나요?");
        int dinnerPri = scanner.nextInt();

        System.out.println("오늘은 " + dinnerMenu + "를 " + dinnerLoc + "에서 먹을겁니다." + " 예상 가격은 " + dinnerPri + "원 입니다.");


        //실습2-2.
        System.out.println("첫번째 숫자를 입력 : ");
        int number1 = scanner.nextInt();

        System.out.println("두번째 숫자를 입력 : ");
        int number2 = scanner.nextInt();

        System.out.println("두 수의 합은 : " + (number1 + number2) + "입니다.");
        System.out.println("두 수의 평균은 : " + (number1 + number2)/2 + "입니다.");


        //실습2-3.

        System.out.print("성별(M/F) : ");
        char gender = scanner.next().charAt(0);

        System.out.println("입력한 성별 : " + gender);


        scanner.close();

    }
}
