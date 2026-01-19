package JAVA_260119;

public class B_Child extends B_Parent{
    public B_Child() {
        super();
        System.out.println("자식 클래스 생성자 호출");
    }

    @Override
    public void show() {
        System.out.println("여기는 B_Child 클래스입니다.");
    }
}
