package com.j.mybootdemo.dao;


import com.j.mybootdemo.models.Employee;
import com.j.mybootdemo.models.Employees;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDAO
{
    private static final Employees list = new Employees();

    static
    {
        list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
    }

    public Employees getAllEmployees()
    {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}