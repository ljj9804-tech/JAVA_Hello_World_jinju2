package JAVA_260121.memberProject;

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
}
