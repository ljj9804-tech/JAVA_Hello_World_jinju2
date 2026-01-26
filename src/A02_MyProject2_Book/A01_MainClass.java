package A02_MyProject2_Book;


import java.util.Scanner;

public class A01_MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        A04_RentalManager bookMgr = new A04_RentalManager();
        A04_RentalManager manager = new A04_RentalManager();

        bookMgr.loadBooks();


        while (true) {
            //메인 메뉴 선택창
            System.out.println("\n===== 도서 관리 시스템 =====\n안녕하세요 메뉴를 선택해주세요.");
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
                            System.out.println("\n===== 도서 등록 =====");

                            System.out.print("도서 ID 입력: ");

                            int newId;

                            try {
                                // 숫자 외 값이 들어오면 여기서 예외(Error) 발생
                                // trim()으로 앞뒤 공백 제거
                                newId = Integer.parseInt(sc.nextLine().trim());
                            } catch (NumberFormatException e) {
                                System.out.println("오류: ID는 숫자만 입력 가능합니다. (공백/문자 불가)");
                                break; // 스위치문을 빠져나가 다시 메뉴(while문 시작점)로 이동
                            }

                            if (bookMgr.isDuplicate(newId)) {
                                System.out.println("오류: 이미 존재하는 ID입니다. [" + newId + "]");
                                break;
                            }

                            System.out.print("제목 입력: ");
                            String newTitle = sc.nextLine();

                            System.out.print("저자 입력: ");
                            String newWriter = sc.nextLine();

                            A02_BookClass newBook = new A02_BookClass(newId, newTitle, newWriter);
                            bookMgr.addBook(newBook);

                            break;


                        case 2: //전체 도서 조회
                            bookMgr.showAllBooks();
                            break;


                        case 3: // 도서 대여
                            System.out.println("\n===== 도서 대여 =====");
                            System.out.print("대여할 도서 ID 입력: ");
                            int rentId = Integer.parseInt(sc.nextLine());

                            bookMgr.rentBook(rentId);
                            break;


                        case 4: // 도서 반납
                        System.out.println("\n===== 도서 반납 =====");
                        System.out.print("반납할 도서 ID 입력: ");
                        int returnId = Integer.parseInt(sc.nextLine());

                        // 매니저에 returnBook 메서드를 만들어서 호출 (rentBook과 거의 동일)
                        bookMgr.returnBook(returnId);
                        break;


                    case 5: // 종료
                        bookMgr.saveBooks(); // 종료 전 저장 로직 실행!
                        System.out.println("프로그램을 종료합니다");
                        sc.close();
                        return;

                    default:
                        System.out.println("잘못된 메뉴입니다.");
                }













        } //while



    } //main
}
