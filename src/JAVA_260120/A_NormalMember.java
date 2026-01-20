package JAVA_260120;

public class A_NormalMember extends A_MemberBase implements A_Joinable{

    public A_NormalMember(String name, String email, String password) {
        super(name, email, password);
    }

    @Override
    public void join() {
        System.out.println(name + "님 회원가입 완료.");
    }

    @Override
    public void showInfo() {
        System.out.println("이름 : " +name);
        System.out.println("이메일 : " +email);
    }


}
