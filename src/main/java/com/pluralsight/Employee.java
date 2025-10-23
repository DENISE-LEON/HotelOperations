package com.pluralsight;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Employee {
    //creating an arraylist to store the employee shift durations
    //if punchcard class created: pass in the class name
    private ArrayList<Duration> shifts = new ArrayList<>();

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
       return shifts.stream()
               //double output wanted for accuracy (with minutes)
               .mapToDouble(d-> d.toMinutes() /60)
               .sum();

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
            //sets the end date to time of punch out
            this.endTime = LocalDateTime.now();
            //adds the duration of the shift to the arraylist
            shifts.add (Duration.between(startTime, endTime));
            //must set the times to null to prevent overwriting everytime punch out
            startTime = null;
            endTime = null;
            System.out.println("You have punched out. Go be happy now");
        }
    }

}
//ideas - extra
//create shifts array list
//use streams to add the shifts
//move punchcard stuff into a punchcard method
//create a method that resets the hours worked for the pay period (2x month or monthly)