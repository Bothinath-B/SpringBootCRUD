package com.example.SpringBootJPADemo.Repository;

import com.example.SpringBootJPADemo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    List<Employee> findByRoleContaining(String r);

    @Query(value = "select * from Employee_details where role=:role and dept=:dept",nativeQuery = true)
    List<Employee> findByRoleDept(String role,String dept);
}
