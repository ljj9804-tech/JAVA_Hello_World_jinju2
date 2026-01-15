package JAVA_260114;

public class Note2 {
    public static void main(String[] args) {

        System.out.println("=========");
        int [][] a = new int [5][3];
        int value = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = value++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }   System.out.println();
        }

        System.out.println("=========");

        int [][] b = new int [4][4];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j <b[i].length; j++) {
                if (i == j) {
                    b[i][j] = 1;
                } else {
                    b[i][j] = 0;
                }
            }
        }
        for (int[] ints : b) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }


        System.out.println("=========");
    } //main
} //class
