package com.j.mybootdemo.repository.mongodb;


import com.j.mybootdemo.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
    //https://github.com/shameed1910/springboot-mongodb/tree/master/springboot-mongodb
}
