package JAVA_260119;

public class B01_Main {
    public static void main(String[] args) {
        B_Child a = new B_Child();

        B_Parent p1 = new B_Child();
        p1.show();

        if (p1 instanceof B_Child) {
            B_Child castedChild = (B_Child) p1;
            System.out.println("성공적으로 다운캐스팅 되었습니다.");
        }
    }
}
