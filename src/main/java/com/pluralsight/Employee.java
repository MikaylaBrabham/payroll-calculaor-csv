package com.pluralsight;

public class Employee {

    //added properties
    float id;
    String name;
    float hoursWorked;
    float payRate;

    //add constructors

    public Employee(float id, String name, float hoursWorked, float payRate) {
        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    //add get/set


    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }
}
