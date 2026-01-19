package JAVA_260116;

public class EmployeeMain {
    public static void main(String[] args) {
        Manager manager1 = new Manager("개발팀");
        Manager manager2 = new Manager("영업팀");
        Staff staff1 = new Staff("영업팀");

        manager1.printManagerDept();
        manager2.printManagerDept();
        staff1.printStaffDept();


    }
}
