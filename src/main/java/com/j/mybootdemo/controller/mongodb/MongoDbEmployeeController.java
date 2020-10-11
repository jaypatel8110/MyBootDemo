package com.j.mybootdemo.controller.mongodb;



import com.j.mybootdemo.models.Employee;
import com.j.mybootdemo.repository.mongodb.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mongo")
public class MongoDbEmployeeController  {

    @Autowired
    private EmployeeRepository empRepository;

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody Employee emp) {
        empRepository.save(emp);
        return "employee added successfully::"+emp.getId();
    }

    @GetMapping("/findAllEmployees")
    public List<Employee> getEmployees() {
        return empRepository.findAll();
    }

    @GetMapping("/findEmployee/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id) {
        return empRepository.findById(id);
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        empRepository.deleteById(id);
        return "Deleted Employee Successfully::"+id;
    }
}
