package A01_MyNote;

public class Calc_Child extends Calc_Parent{
    @Override
    void add(int a, int b) {
        super.add(a, b);
        System.out.println("더하기 결과: " + (a+b) + "입니다.");
    }

    void add(int a, int b, int c) {
        System.out.println("세 수의 합: " + (a+b+c));
    }
}
