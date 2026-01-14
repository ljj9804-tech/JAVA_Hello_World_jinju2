package JAVA_260114;

public class Test_3 {
    public static void main(String[] args) {
//        System.out.println("실습3-1===========================");
//       //실습3-1
////     사용자로부터 정수 5개를 입력받아 배열에 저장하고 역순 출력
////     힌트)
//        Scanner scanner = new Scanner(System.in);
////     - 크기가 5개인 정수를 요소로 가지는 배열 생성
//        int[] nums = new int[5];
////     - 스캐너를 이용해서, 입력받은 정수를 , 배열에 담기 , 반복문 활용
//        System.out.println("정수 5개를 입력하세요");
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = scanner.nextInt();
//        }
////     - 배열에서 꺼내서, 출력하기.
//        System.out.println("역순으로 출력");
//        for (int i = nums.length - 1; i >= 0; i--) {
//            System.out.println(nums[i]);
//        }
//
//        scanner.close();

        System.out.println("실습3-2===========================");
        //실습3-2
//      3x3 배열을 만들어 모든 요소에 1~9 채우고 출력

        int [][] grid = new int [3][3];
        int count = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = count++;
            }
        }

        System.out.println("--- 3x3 배열 출력 ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " "); // 여기서 '읽기' 발생
            }
            System.out.println(); // 줄바꿈
        }


        System.out.println("실습3-3===========================");
        //실습3-3
//      문자열 배열을 메서드로 받아 가장 긴 문자열을 반환
//      힌트)
//      - 배열을 반환하는 메서드를 생성합니다.
//      public static String 메서드명(String[] 배열이름)
//      - 반복문을 이용해서, 배열 안에 들어 있는 문자열 중에서 가장 긴 문자열 찾아서
//      배치. 배열의 길이를 이용하면. 배열. length()





    }
}
