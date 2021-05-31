package com.pet.softwaresim.models;

import com.pet.softwaresim.interfaces.Employee;

public class Programmer implements Employee {

    private String name;
    private double salary;
    private int yearExperience;

    public Programmer(String name, int yearExperience) {
        this.yearExperience = yearExperience;
        this.name = name;
        this.salary = 100;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
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
    public double doWork() {
        return yearExperience * salary;
    }
}
