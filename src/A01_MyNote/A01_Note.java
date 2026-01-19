package A01_MyNote;

import java.util.Scanner;

public class A01_Note {
    public static void main(String[] args) {

//        double score[][] = {
//                {3.3, 3.4},
//                {3.5, 3.6},
//                {3.7, 4.0},
//                {4.1, 4.2},
//        };
//
//        double sum1 = 0;
//        for (int year=0; year < score.length; year++){
//            for (int term = 0; term < score[year].length; term++){
//                sum1 += score[year][term];
//            };
//        };
//
//        int n = score.length, m = score[0].length;
//        System.out.println("4년 전체 평점 평균 : " + sum1 /(n*m));
//
//        //===============================================================
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("정수 3개를 입력하세요");
//        int[] intArr = new int[3];
//
//        int max=0; //현재 가장 큰 수
//
//        for(int i=0; i<intArr.length; i++) {
//            intArr[i] = scanner.nextInt();
//            if(intArr[i]>max) {
//                max = intArr[i];
//            }
//        };
//
//        System.out.println("가장 큰 수는 [" + max + "] 입니다");
//        System.out.println("=====================================");
//
//        //===============================================================
//        System.out.println("정수 3개를 입력하세요");
//        int [] sArr = new int [3];
//        int sum2 = 0;
//
//        for (int i = 0; i < sArr.length; i++) {
//            sArr[i] = scanner.nextInt();
//            if(sArr[i] >= 0) {
//                sum2 += sArr[i];
//            } continue;
//        };
//        System.out.println("평균 : " + sum2/sArr.length);
//        System.out.println("=====================================");
//
//        scanner.close();

        //===============================================================
        int [] nn = {1,2,3,4,5};
        int sum3 = 0;

        for(int i : nn) {
            sum3 += i;
        }
        System.out.println("배열의 합 : " + sum3);


        String [] ss = {"사과", "딸기", "수박"};
        System.out.print("과일 종류 : ");
        for(String i : ss) {
            System.out.print(i + " ");
        }








    } //main
}
