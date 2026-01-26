package A03_MyProject1;

public abstract class _3_MemberBase {
    protected String name;
    protected String email;
    protected String password;
    protected int age;

    public _3_MemberBase(String name, String email, String password, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    //메서드

    // showInfo 회원정보 출력용
    public abstract void showInfo();

    //getter 회원정보 불러오기용
    //조건 검색 및 파일 저장 시 사용예정(외부에서 해당 변수 사용불가, 메서드로 불러올거임)
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

    //setter 회원정보 수정용
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAge(int age) {
        this.age = age;
    }
} //class
