package com.sviatski.spring.mvc;

import com.sviatski.spring.mvc.Validation.CheckEmail;
import jakarta.validation.constraints.*;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2,message = "name must be min 2 symbols")
    private String name;

    //@NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field")
    private String surname;

    @Min(value = 500,message = "must be greater than 499")
    @Max(value = 1000,message = "must be less than 1001")
    private int salary;

    private String department;

    private Map<String,String> departments;

    private String carBrand;

    private Map<String,String> carBrands;

    private String[] languages;

    private Map<String,String> languagesMap;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}",message = "please use pattern XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail()
    private String email;





    public Employee() {
        departments = new HashMap<>();
        departments.put("IT","Information Technology");
        departments.put("HR","Human Resources");
        departments.put("Sales","Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW","BMW");
        carBrands.put("Audi","Audi");
        carBrands.put("Mercedes-Benz","MB");

        languagesMap = new HashMap<>();
        languagesMap.put("English","EN");
        languagesMap.put("Deutch","DE");
        languagesMap.put("Franch","Fr");

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getLanguagesMap() {
        return languagesMap;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLanguagesMap(Map<String, String> languagesMap) {
        this.languagesMap = languagesMap;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
