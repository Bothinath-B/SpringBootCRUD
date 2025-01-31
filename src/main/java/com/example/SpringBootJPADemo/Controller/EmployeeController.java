package com.example.SpringBootJPADemo.Controller;

import com.example.SpringBootJPADemo.Model.Employee;
import com.example.SpringBootJPADemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllEmployee")
    public List<Employee> findAllEmp(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/setEmployee")
    private String addEmp(@RequestBody Employee e){
        employeeService.addEmployee(e);
        return "Data added!";
    }

    @GetMapping("/getEmpById/{id}")
    public Employee getEmpById(@PathVariable int id){
        return employeeService.findEmpById(id);
    }

    @PutMapping("/updateEmp/{id}")
    public ResponseEntity<Employee> changeEmp(@PathVariable int id, @RequestBody Employee em){
        Employee emp=employeeService.updateEmployee(id,em);
        if(emp==null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(emp);
    }

    @DeleteMapping("/removeEmp/{id}")
    public String deleteEmp(@PathVariable int id)
    {
        boolean check=employeeService.deleteEmployee(id);
        if(check) return "Deletion Successful!";
        return "Id not found!";
    }

    @GetMapping("/getEmpByRole/{role}")
    public List<Employee> getEmpByRole(@PathVariable(name = "role") String r)
    {
        return employeeService.getEmployeeByRole(r);
    }

    @GetMapping("/getEmpByRoleAndDept")
    public List<Employee> getEmpByRole(@RequestParam String role,@RequestParam String dept){
        System.out.println(role+":"+dept);
        return employeeService.getEmployeeByRoleAndDept(role,dept);
    }
}