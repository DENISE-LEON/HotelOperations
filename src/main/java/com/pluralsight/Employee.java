package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    //derived getters
    public double getTotalPay() {
        return (this.payRate * getRegularHours()) + (getOvertimeHours() * this.payRate * 1.5);
    }

    public double getRegularHours() {

        if(this.getHoursWorked() > 40) {
            return 40;
        }
        return this.getHoursWorked();
    }

    public double getOvertimeHours() {
        return this.getHoursWorked() > 40 ? this.getHoursWorked() - 40 : 0;
    }

    //setters
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

//methods
//this class stores and calculates payroll info abt info
