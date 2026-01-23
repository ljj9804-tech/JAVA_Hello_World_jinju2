package JAVA_260123.memberProject;

public abstract class AA_MemberBase {
    protected String name;
    protected String email;
    protected String password;
    protected int age;

    public AA_MemberBase(String name, String email, String password, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    //메소드
    public abstract void showInfo();

    //회원정보 불러오기 메소드
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public int getAge() {
        return age;
    }

    //회원정보 수정 메소드
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
