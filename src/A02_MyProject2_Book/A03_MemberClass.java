package A02_MyProject2_Book;

//회원 정보 관리
public class A03_MemberClass {
    private String email; //로그인 아이디(중복 불가)
    private String password; //비밀번호
    private String name; //이름
    private int age; //이름

    public A03_MemberClass(String email, String password, String name, int age) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.age = age;
    }

    //Getter 매서드: 정보 조회용
    public String getEmail() {return email;}
    public String getPassword() {return password;}
    public String getName() {return name;}
    public int getAge() {return age;}

    //showMemberInfo 회원 정보 출력용
    public void showMemberInfo() {
        System.out.println("이메일: " + email);
        System.out.println("이름: " + name + "| 나이: " + age);
    }
}
