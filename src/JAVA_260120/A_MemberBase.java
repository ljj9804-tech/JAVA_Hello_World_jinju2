package JAVA_260120;

public abstract class A_MemberBase {
    protected String name;
    protected String email;
    protected String password;


    public A_MemberBase(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

    }

    //메소드
    public abstract void showInfo();

    //임시저장파일에 가져갈 값
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

}
