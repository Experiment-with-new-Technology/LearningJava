package com.extremecoder.dao;

import com.extremecoder.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    public void addEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    public void removeEmployee(int id);

    public List<Employee> listEmployees();

}
