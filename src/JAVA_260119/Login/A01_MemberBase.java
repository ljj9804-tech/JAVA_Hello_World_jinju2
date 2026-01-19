package JAVA_260119.Login;

public class A01_MemberBase {
    abstract class MemberBase {
        protected String name;
        protected String email;
        protected int age;

        public MemberBase(String name, String email, int age){
            this.name = name;
            this.email
            this.age = age;
        }

        public abstract void showInfo(); // 정보 출력용 추상 메서드

    }
}
