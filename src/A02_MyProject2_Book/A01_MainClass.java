package A02_MyProject2_Book;


import java.util.Scanner;

public class A01_MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        A04_RentalManager bookMgr = new A04_RentalManager();
        A04_RentalManager manager = new A04_RentalManager();

        while (true) {
            //메인 메뉴 선택창
            System.out.println("\n==== 도서 관리 시스템 ====\n안녕하세요 메뉴를 선택해주세요.");
            System.out.println("1. 도서 등록");
            System.out.println("2. 전체 도서 조회");
            System.out.println("3. 도서 대여");
            System.out.println("4. 도서 반납");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택 >>");

            int choice = Integer.parseInt(sc.nextLine());
            //==========================================================================

            //switch
            switch (choice){
                case 1: //도서 등록

                case 2: //전체 도서 조회

                case 3: // 도서 대여

                case 4: // 도서 반납

                case 5: // 종료
                    System.out.println("프로그램을 종료합니다");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 메뉴입니다.");
            }













        } //while



    } //main
}
