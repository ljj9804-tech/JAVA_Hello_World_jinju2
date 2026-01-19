package A01_MyNote;

public class A03_Note {
    public static void main(String[] args) {
        System.out.println("===연습문제 1======================== \n");
        //[연습 문제 1] 학급별 점수 합계와 평균 (기초)
        //3개의 학급이 있고, 각 학급에 3명씩 학생이 있다고 가정합니다.
        //데이터:
        //1반: {90, 80, 70}
        //2반: {100, 95, 90}
        //3반: {85, 88, 92}

        //요구사항: 위 데이터를 2차원 배열(int[][])에 저장하세요.



        int AClass [][] = {
                {90, 80, 70},
                {100, 95, 90},
                {85, 88, 92}
        };

        //이중 for문을 사용하여 전체 학생의 총점과 전체 평균을 구하세요.

        int sum = 0; //전체 학생의 총점
        int count = 0;

        for(int i=0; i<AClass.length; i++) {
            for(int j=0; j<AClass[i].length; j++) {
                sum += AClass[i][j];
                count += 1;
            }
        };
        System.out.println("총점은 " + sum + "점 입니다");
        System.out.println("전체 평균은 " + (sum/count) + "점 입니다 \n");

        System.out.println("===연습문제 2======================== \n");

        double [][] scores = {
                {3.5, 4.0}, //1학년 1,2학기 i[0]
                {3.2, 4.1, 3.8} //2학년 1,2,계절학기 i[1]
        };

        double rowSum = 0;

        for(int i = 0; i < scores.length; i++) {
            for(int j = 0; j < scores[i].length; j++) {
                rowSum += scores[i][j];
            }
            double rowAvg = rowSum / scores[i].length;
            System.out.println((i + 1) + "학년의 평균: " + rowAvg);
        }

        System.out.println("\n===연습문제 3======================== \n");

        int[][] numbers = {
                {12, 45, 23},
                {67, 89, 10},
                {34, 56, 78}
        };

        int max = 0;

        for(int i = 0; i < numbers.length; i++ ) {
            for(int j = 0; j < numbers[i].length; j++) {
                int n = numbers[i][j];
                if(n > max) {
                    max = n;
                }
            }
        }
        System.out.println("가장 큰 값은 " + max);

    }//main

}
