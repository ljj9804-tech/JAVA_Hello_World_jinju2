package JAVA_260119.Login;

public abstract class A01_MemberBase {
        protected String name;
        protected String email;
        protected int Pw;

        public A01_MemberBase(String name, String email, int Pw){
            this.name = name;
            this.email = email;
            this.Pw = Pw;
        }

        public abstract void showInfo(); // 정보 출력용 추상 메서드

    }

