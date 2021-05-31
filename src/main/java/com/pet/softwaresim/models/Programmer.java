package com.pet.softwaresim.models;

import com.pet.softwaresim.interfaces.Employee;

public class Programmer implements Employee {

    private String name;
    private double salary;

    public Programmer(String name) {
        this.name = name;
        this.salary = 100;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {

    }
}
