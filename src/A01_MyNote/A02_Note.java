package A01_MyNote;

public class A02_Note {
    public static void main(String[] args) {
        //2차원 배열
        double score [][] = {
                {3.3,3.4},
                {3.5,3.6},
                {3.7,4.0},
                {4.1,4.2},
                };

        double sum1 = 0;
        int count = 0;

        for (int i=0; i < score.length; i++) {
            for(int j=0; j < score[i].length; j++) {
                sum1 += score[i][j];
                count += 1;
            }
        } //for1
        System.out.println(count);
        System.out.println(sum1/count);

    } //main
}
