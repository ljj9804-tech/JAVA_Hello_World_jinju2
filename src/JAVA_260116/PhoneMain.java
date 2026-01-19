package JAVA_260116;

public class PhoneMain {
    public static void main(String[] args) {
        Phone p1 = new Phone("핸드폰1", "010-1111-1111");
        Phone p2 = new Phone("핸드폰2", "010-2222-2222");
        Phone p3 = new Phone("핸드폰3", "010-3333-3333");

        System.out.println("--- 제조사 변경 전 ---");
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();

//        Phone.manufacturer = "임시이름";
        Phone.changeManufacturer("삼성");

        System.out.println("\n--- 제조사 변경 후 ---");
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();

    } //main
} //class
