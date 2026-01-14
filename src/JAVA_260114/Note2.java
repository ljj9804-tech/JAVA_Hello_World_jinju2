package JAVA_260114;

public class Note2 {
    public static void main(String[] args) {

        int[] a = new int[2];
        a[0] = 1; a[1] = 2;

        for (int i = 0; i <2; i++) {
            System.out.println(a[i]);
        }
        System.out.println("======");


        int[] b = {1, 2, 3};

        for (int i =0; i < 3; i++) {
            System.out.println(b[i]);
        }
        System.out.println("======");

        int[][] c = new int[2][3];

//        System.out.println(c[1][2]);
//        System.out.println(c[3][4]);
//        System.out.println(c[5][6]); //희망 출력물 예시

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3; j++) {
                System.out.println(c[i][j]);
            } //for_2
        } //for_1








    } //main
} //class
