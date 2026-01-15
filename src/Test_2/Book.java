package Test_2;
        //클래스명 Book
public class Book {
   //변수
    String name;
    String price;
    String writer;

//            생성자로 묶음
            public Book(String name, String price, String writer) {
                this.name = name;
                this.price = price;
                this.writer = writer;
            }

            public Book(String name) {
                this(name,"미정","미상");
            }

            //메서드 정의
            // void로 호출한 함수는 반환값이 없음(돌아오는 값이 없다)
    void introduceBook() {
        System.out.println("이 책의 이름은 \""+name+"\" 입니다.");
        System.out.println("책의 가격은 "+price+"원 입니다.");
        System.out.println("책의 저자는 \""+writer+"\" 입니다.");
        System.out.println();
    }
}//class
