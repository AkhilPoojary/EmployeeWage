package org.example;

public class Employee {

    private String empName;
    private String empPhone;
    private String department;
    private boolean attedence;

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", department='" + department + '\'' +
                ", attedence=" + attedence +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isAttedence() {
        return attedence;
    }

    public void setAttedence(boolean attedence) {
        this.attedence = attedence;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Employee(String empName, String empPhone, String department, boolean attedence) {
        this.empName = empName;
        this.empPhone = empPhone;
        this.department = department;
        this.attedence = attedence;
    }


}
