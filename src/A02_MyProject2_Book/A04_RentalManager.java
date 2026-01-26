package A02_MyProject2_Book;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.*;

//대여, 반납 로직
public class A04_RentalManager {
    //Key는 Integer(bookId), Value는 Book객체
    private HashMap<Integer, A02_BookClass> bookMap = new HashMap<>();

    //도서 추가 기능
    public void addBook(A02_BookClass book) {
        bookMap.put(book.getBookId(), book);
        System.out.println("등록이 완료되었습니다.");
    }

    //도서 목록 전체 출력
    public void showAllBooks() {
        System.out.println("\n===== 전체 도서 목록 =====");
        if (bookMap.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        for (A02_BookClass book : bookMap.values()) {
            book.showBookInfo();
            System.out.println("----------------------");
        }
        System.out.println("\n[총 " + bookMap.size() + "권의 도서가 조회되었습니다.]\n");
    }

    //중복을 확인해주는 메서드
    public boolean isDuplicate(int id) {
        return bookMap.containsKey(id);
    }

    // 1. 도서 대여 기능 (case 3에서 사용)
    public void rentBook(int id) {
        A02_BookClass book = bookMap.get(id); // 맵에서 ID로 객체 찾기

        if (book == null) {
            System.out.println("오류: 해당 ID의 도서가 존재하지 않습니다.");
        } else if (!book.isAvailable()) {
            System.out.println("이미 대여 중인 도서입니다. (" + book.getTitle() + ")");
        } else {
            book.setAvailable(false); // 상태를 '대여 중'으로 변경
            System.out.println("'" + book.getTitle() + "' 대여가 완료되었습니다.");
        }
    }

    // 2. 도서 반납 기능 (case 4에서 사용)
    public void returnBook(int id) {
        A02_BookClass book = bookMap.get(id);

        if (book == null) {
            System.out.println("오류: 해당 ID의 도서는 등록되지 않았습니다.");
        } else if (book.isAvailable()) {
            System.out.println("이 도서는 이미 반납된 상태(대여 가능)입니다.");
        } else {
            book.setAvailable(true); // 상태를 '대여 가능'으로 변경
            System.out.println("'" + book.getTitle() + "' 반납이 성공적으로 처리되었습니다.");
        }
    }

    // 도서 정보를 파일에 저장
    public void saveBooks() {
        // try-with-resources 문법으로 파일 리소스 자동 닫기
        try (PrintWriter pw = new PrintWriter(new FileWriter("books.txt"))) {
            for (A02_BookClass book : bookMap.values()) {
                // 구분자(,)를 이용해 데이터 저장: ID,제목,저자,대여가능여부
                pw.println(book.getBookId() + "," + book.getTitle() + "," +
                        book.getWriter() + "," + book.isAvailable());
            }
            System.out.println("도서 데이터가 'books.txt'에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
        }
    }

    // 파일에서 도서 정보를 읽어와 bookMap에 채우기
    public void loadBooks() {
        File file = new File("books.txt");

        // 파일이 없으면 불러오지 않고 종료
        if (!file.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // 쉼표(,)를 기준으로 데이터 분리 (ID,제목,저자,대여가능여부)
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String title = data[1];
                String writer = data[2];
                boolean isAvailable = Boolean.parseBoolean(data[3]);

                // 객체 생성 및 상태 복구
                A02_BookClass book = new A02_BookClass(id, title, writer);
                book.setAvailable(isAvailable);

                // 맵에 추가
                bookMap.put(id, book);
            }
            System.out.println("데이터 로딩 완료: " + bookMap.size() + "권의 도서를 불러왔습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류 발생: " + e.getMessage());
        }
    }





}
