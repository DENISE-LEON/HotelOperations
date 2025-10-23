package com.pluralsight;

import java.time.Duration;
import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private LocalDateTime startTime;
      private LocalDateTime endTime;

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
    //turning get hours worked into a derived getter that returns hours based on start and end time
    public double getHoursWorked() {
        Duration hoursWorked = Duration.between(startTime, endTime);
        return hoursWorked.toMinutes() /60.0;
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


//methods
//punch in method, uses time.now to set time
    public void punchIn() {
        if(this.startTime != null) {
            System.out.println("You have already punched in");
        } else {
            this.startTime = LocalDateTime.now();
            System.out.println("Punch in successful");
        }
    }
//punch out method
    public void punchOut() {
        if (this.startTime == null) {
            System.out.println("You have not punched in");
        } else {
            this.endTime = LocalDateTime.now();
            System.out.println("You have punched out. Go be happy now");
        }
    }

}
