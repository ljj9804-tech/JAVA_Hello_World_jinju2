package JAVA_260116;

public class Manager extends Employee {

    public Manager(String department) {
        super(department);
    }

    public void printManagerDept() {
        System.out.println("Manager 소속 부서 : " + department);
    }

}
