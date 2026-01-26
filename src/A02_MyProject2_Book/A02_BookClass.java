package A02_MyProject2_Book;

//도서 정보 관리
public class A02_BookClass {
    protected final int bookId; //도서 고유번호[Key로 사용 예정]
    protected String title; //도서 이름
    protected String writer; //도서 저자
    protected boolean isAvailable; // 대여 가능 여부

    //생성자: 신규 도서 등록 초기값[아이디, 타이틀, 저자]
    public A02_BookClass(int bookId, String title, String writer) {
        this.bookId = bookId; //key
        this.title = title;
        this.writer = writer;
        this.isAvailable = true; //신규 도서 등록 시 대여 가능 여부는 true로 설정
    }
    //---------------------------------------------------------------

    //Key로 사용할 ID반환
    public int getBookId() { return bookId; }
    public String getTitle() { return title; }

    // 도서 대여 가능여부 확인
    public boolean isAvailable() {
        return isAvailable;
    }
    //대여 가능 여부 변경[true/ false]
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    //도서 정보 출력
    public void showBookInfo() {
        String status = isAvailable ? "대여 가능" : "대여 중";
        System.out.println("[" + bookId + "]\n제목: " + title + "\n저자: " + writer + "\n대여 가능 여부: " + status);
    }

    // 저자(writer) 정보를 반환하는 Getter
    public String getWriter() {
        return writer;
    }


} //class
