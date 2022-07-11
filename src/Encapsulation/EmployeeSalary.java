package Encapsulation;

public class EmployeeSalary {
    private String EmpName;
    private int EmpID;
    private int EmpSal;

    public int getEmpSal() {

        return EmpSal;
    }

    public String getEmpName() {

        return EmpName;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpSal(int EmpSal) {

        this.EmpSal = EmpSal;

    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }
}

class EmployeeEncaps {
    public static void main(String[] args) {
        EmployeeSalary EmpObj = new EmployeeSalary(); //object of the class Employee
//passing the values to the methods using object
        EmpObj.setEmpName("Anna");
        EmpObj.setEmpSal(30000);
        EmpObj.setEmpID(670311);
// Printing values of the variables
        System.out.println("Employee's Name: " + EmpObj.getEmpName());
        System.out.println("Employee's ID: " + EmpObj.getEmpID());
        System.out.println("Employee's Salary: " + EmpObj.getEmpSal());
    }
}