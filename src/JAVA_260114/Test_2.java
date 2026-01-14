package JAVA_260114;

import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
//
//        실습2
//        1)1~100까지의 합 출력
//        힌트 for 문 활용
        System.out.println("==========실습 2-1====================");
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }   System.out.println(sum);

//
//        2)사용자로부터 양수만 입력받고 음수가 입력되면 종료
//        힌트 do-while 문 활용
        System.out.println("==========실습 2-2====================");
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력합니다");
        System.out.println("음수 입력 시 종료");

        do{
            int number = scanner.nextInt();
        if (number > 0) {
            System.out.println(number);
            System.out.println("숫자를 입력합니다");
            System.out.println("음수 입력 시 종료");
        } else if (number < 0) {
            System.out.println("종료합니다.");
            break;
        }
        } while (true);

        scanner.close();

        //        3)1~50 사이에서 7의 배수만 출력하되, 30이 넘으면 종료
//        힌트 for 문 활용
        System.out.println("==========실습 2-3====================");
        for (int i = 1; i <=50; i++) {
            if(i%7 != 0) continue;
            if(i > 30) break;
            System.out.println(i);
        }

    }
}
