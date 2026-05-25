package com.pluralsight;

public class Employee {

    //added properties
    int id;
    String name;
    double hoursWorked;
    double payRate;

    //add constructors

    public Employee(int id, String name, double hoursWorked, double payRate) {
        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    //add get/set

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    // add derived properties

    public double getGrossPay() {
        double grossPay = hoursWorked * payRate;
        return grossPay;
    }
}
