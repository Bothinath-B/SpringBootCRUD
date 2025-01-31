package com.example.SpringBootJPADemo.Service;

import com.example.SpringBootJPADemo.Model.Employee;
import com.example.SpringBootJPADemo.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public void addEmployee(Employee e) {
        employeeRepo.save(e);
    }

    public Employee findEmpById(int id) {
        return employeeRepo.findById(id).orElse(new Employee());
    }

    public Employee updateEmployee(int n,Employee em) {
        Optional<Employee> temp=employeeRepo.findById(n);
        if(temp.isPresent()){
            Employee tempEmp=temp.get();
            tempEmp.setName(em.getName());
            tempEmp.setDept(em.getDept());
            tempEmp.setRole(em.getRole());
            return employeeRepo.save(tempEmp);
        }
        return null;
    }

    public boolean deleteEmployee(int id) {
        Optional<Employee> e=employeeRepo.findById(id);
        if(e.isPresent()){
            Employee em=e.get();
            employeeRepo.delete(em);
            return true;
        }
        return false;
    }


    public  List<Employee> getEmployeeByRole(String r) {
        return employeeRepo.findByRoleContaining(r);
    }

    public List<Employee>getEmployeeByRoleAndDept(String role,String dept){
        return employeeRepo.findByRoleDept(role,dept);
    }
}
