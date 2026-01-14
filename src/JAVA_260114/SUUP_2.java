package JAVA_260114;

public class SUUP_2 {
    public static int[] getData() {
        return new int[]{5, 10, 15};
    }
    public static void main(String[] args) {

        //배열과 다차원 배열, 메서드에서 배열 리턴하기

        //1차원 배열
        int [] scores = new int[5]; //내용은 비워져있고, 크기는 고정(5칸)
        int [] numbers = {1, 2, 3, 4, 5}; //내용이 채워져있고, 크기도 고정(5칸)

        //2차원 배열
        int [] [] matrix = {
                {1, 2}, //[0][1] : [0]행의 [1]열
                {3, 4}, //[1][1] : [1]행의 [1]열
                {5, 6},
        };

        //메서드에서 배열 반환
        /*
        퍼블릭 : 어느 위치에서든 해당 메서드에 접근 가능.
        스택 : 따로 객체(인스턴스)를 생성 안해도, 사용가능
        인트 : 메서드 이름 앞에 있는 키워드, 메서드가 반환하는 타입
        메이크어레이 : 메서드 이름
        ===크기도 고정, 값의 위치도 고정임===
        */

    //===============================================================


        // 예제 1: 배열 선언 후 출력
        int[] nums = {10, 20, 30};
        for (int n : nums) { // 향상된 for , 배열의 모든 요소를 순회.
            System.out.println(n);
        }

        // 예제 2: 2차원 배열 순회
        int[][] grid = {{1,2}, {3,4}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        // static, main 메소드 밖으로 이동 했음.
        int[] result = getData();

        System.out.println(result[1]); // 10
    }
}

//Test_3
