package JAVA_260116;

public class Staff extends Employee{
    public Staff(String department) {
        super(department);
    }

    public void printStaffDept() {
        System.out.println("Staff 소속 부서 : " + department);
    }
}
