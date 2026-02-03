package com.lpu.OOps.encapsulation;

public class Employee {
    private String name;
    private int empID;
    private String companyName;
    private boolean isPermanentEmployee;
    private long salry;
    private long phoneNumber;

    public Employee(String name, int empID, String companyName, boolean isPermanentEmployee, long salry, long phoneNumber) {
        this.name = name;
        this.empID = empID;
        this.companyName = companyName;
        this.isPermanentEmployee = isPermanentEmployee;
        this.salry = salry;
        this.phoneNumber = phoneNumber;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public int getEmpID() {
        return empID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public boolean isPermanentEmployee() {
        return isPermanentEmployee;
    }

    public long getSalry() {
        return salry;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPermanentEmployee(boolean permanentEmployee) {
        isPermanentEmployee = permanentEmployee;
    }

    public void setSalry(long salry) {
        this.salry = salry;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean info() {
        return true;
    }
}