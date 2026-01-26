package A03_MyProject1;

public class _4_NomalMember extends _3_MemberBase implements _2_Join {

    public _4_NomalMember(String name, String email, String password, int age) {
        super(name, email, password, age);
    }

    @Override
    public void join() {
        System.out.println("[" + name + "]님 회원가입 완료.\n환영합니다!");
    }

    @Override
    public void showInfo() {
        System.out.println("이름 : " +name);
        System.out.println("이메일 : " +email);
        System.out.println("나이 : " +age);
    }
}
