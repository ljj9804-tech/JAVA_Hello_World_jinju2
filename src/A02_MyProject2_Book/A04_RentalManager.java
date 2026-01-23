package A02_MyProject2_Book;

import java.util.HashMap;

//대여, 반납 로직
public class A04_RentalManager {
    //Key는 Integer(bookId), Value는 Book객체
    private HashMap<Integer, A02_BookClass> bookMap = new HashMap<>();

    //도서 추가 기능
    public void addBook(A02_BookClass book) {
        bookMap.put(book.getBookId(), book);
    }

    //도서 목록 전체 출력
    public void showAllBooks() {
        System.out.println("\n===== 전체 도서 목록 =====");
        if (bookMap.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        System.out.println("\n[총 " + bookMap.size() + "권의 도서가 조회되었습니다.]\n");
        for (A02_BookClass book : bookMap.values()) {
            book.showBookInfo();
            System.out.println("----------------------");
        }
    }



}
