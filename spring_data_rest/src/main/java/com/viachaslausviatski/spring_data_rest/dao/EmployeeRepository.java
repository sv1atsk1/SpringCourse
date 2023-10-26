package com.viachaslausviatski.spring_data_rest.dao;




import com.viachaslausviatski.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


//login - user
// password - generates in security console
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    public List<Employee> findAllByName(String name);

}
