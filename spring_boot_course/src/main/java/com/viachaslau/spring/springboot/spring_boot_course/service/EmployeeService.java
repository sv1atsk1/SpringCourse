package com.viachaslau.spring.springboot.spring_boot_course.service;



import com.viachaslau.spring.springboot.spring_boot_course.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
