package com.example.employeemanagementsystem.repository;


import com.example.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    List<Employee> findByName(String name);

    Employee findByEmail(String email);
}
