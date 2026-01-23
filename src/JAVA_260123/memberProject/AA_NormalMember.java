package JAVA_260123.memberProject;

public class AA_NormalMember extends AA_MemberBase implements AA_Joinable {

    public AA_NormalMember(String name, String email, String password, int age) {
        super(name, email, password, age);
    }

    @Override
    public void join() {
        System.out.println("[" + name + "]님 회원가입 완료! 환영합니다");
    }

    @Override
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("이메일: " + email);
        System.out.println("나이: " + age);

    }
}
