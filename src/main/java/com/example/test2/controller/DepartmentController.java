package com.example.test2.controller;

import com.example.test2.pojo.Department;
import com.example.test2.repository.DepartmentRepository;
import com.example.test2.service.DepartmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/Department")
public class DepartmentController {
    @Autowired
    private DepartmentServices departmentServices;
    @PostMapping("/create")
    @ResponseBody
    public Department createDepartment(@RequestBody Department department){
        return departmentServices.createDepartment(department);
    }
    @GetMapping("/get")
    @ResponseBody
    public List<Department> readDepartment(){
        return departmentServices.readDepartment();
    }
    @DeleteMapping("/delete")
    @ResponseBody
    public String deleteDepartment(@PathVariable("id") Long deptid){
        departmentServices.deleteDepartment(deptid);
        return "Deleted Successfully";
    }
    @PutMapping("/{id}")
    @ResponseBody
    public Department updateDepartment(@RequestBody Department department,@PathVariable("id") Long deptid){
        return departmentServices.updateDepartment(department,deptid);
    }


}
