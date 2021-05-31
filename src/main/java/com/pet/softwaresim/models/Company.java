package com.pet.softwaresim.models;

import com.pet.softwaresim.interfaces.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class Company {
    private String name;
    private double money;
    private List<Employee> employees;

    public Company(String name, double money, List<Employee> employees) {
        this.name = name;
        this.money = money;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
