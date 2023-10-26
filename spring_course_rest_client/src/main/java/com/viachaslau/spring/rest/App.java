package com.viachaslau.spring.rest;

import com.viachaslau.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.viachaslau.spring.rest.configuration.MyConfig;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(4);
//        System.out.println(employee);

//        Employee employee = new Employee("Sveta","Sokolova","IT",1200);
//        employee.setId(9);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(9);


    }
}
