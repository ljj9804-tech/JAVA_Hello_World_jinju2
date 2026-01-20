package JAVA_260119.Login;

public class A01_NormalMember extends A01_MemberBase implements A01_Joinable {
    // 매개변수가 3개인 생성자
    public A01_NormalMember(String name, String email, int Pw) {
        super(name,email,Pw);
    }

    // Joinable 인터페이스의 메서드를 재정의,
    @Override
    public void join() {
        System.out.println(name + "님 회원가입 완료.");
    }
    // 추상 클래스의 , 추상 메서드를 반드시 구현하기.
    @Override
    public void showInfo() {
        System.out.println("이름 : " +name);
        System.out.println("이메일 : " +email);
        System.out.println("패스워드 : " +Pw);
    }
}