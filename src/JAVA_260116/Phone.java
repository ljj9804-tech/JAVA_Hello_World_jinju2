package JAVA_260116;
//실습4
public class Phone {

    private static String manufacturer="애플";
    private String model;
    private String phoneNumber;

    public Phone(String model, String phoneNumber) {
        this.model = model;
        this.phoneNumber = phoneNumber;
    }

    public void printInfo() {
        System.out.println(Phone.manufacturer +
                " 모델: " + model +
                " 번호: " + phoneNumber);
    }

    //제조사 이름 변경을 위한 메서드
    public static void changeManufacturer(String newName) {
        manufacturer = newName;
    }
} //class
