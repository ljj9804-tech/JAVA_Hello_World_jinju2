package JAVA_260114;

import java.util.Scanner;

public class Note {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.println("====메뉴판====================");
            System.out.println("1. 아메리카노:1,000원");
            System.out.println("2. 카페라떼:1,500원");
            System.out.println("============================");
            System.out.println("커피를 선택하세요 : ");


            int coffe = scanner.nextInt();

            while (true) {
                if (coffe == 1) {
                    System.out.println("아메리카노를 선택하셨습니다");
                    System.out.println("금액은 1,000원 입니다");
                    int price = scanner.nextInt();

                    if (price == 1000) {
                        System.out.println("아메리카노 한잔 나왔습니다.");
                        break;
                    } else
                        System.out.println("금액을 확인해주세요");

                } else if (coffe == 2) {
                    System.out.println("카페라떼를 선택하셨습니다");
                    System.out.println("금액은 1,500원 입니다");
                    int price = scanner.nextInt();

                    if (price == 1500) {
                        System.out.println("카페라떼 한잔 나왔습니다.");
                        break;
                    } else
                        System.out.println("금액을 확인해주세요");

                } else {
                    System.out.println("메뉴판을 확인해주세요");
                    break;
                }//if
            } //if while



    } //main
} //class
