package com.example.test2.service;

import com.example.test2.pojo.Department;
import com.example.test2.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServices {
    @Autowired
    private DepartmentRepository departmentRepository;
    public Department createDepartment(Department department){
        return departmentRepository.save(department);
    }
    public List<Department> readDepartment(){
        return departmentRepository.findAll();
    }
    public Department updateDepartment(Department department,long deptid){
        Department db = departmentRepository.findById(deptid).get();
        if(Objects.nonNull(department.getDeptid()))
            db.setId(department.getId());
        if(Objects.nonNull(department.getSalary()))
            db.setSalary(department.getSalary());
        if(Objects.nonNull(department.getEmp_name()))
            db.setEmp_name(department.getEmp_name());
        return departmentRepository.save(db);
    }
    public String deleteDepartment(Long deptid){
        departmentRepository.deleteById(deptid);
        return "Deleted Successfully";
    }
    public List<String> getNamesById(Long deptid){
        List<Department> list = departmentRepository.findAll();
        List<String> ans = new ArrayList<>();
        for(Department i: list){
            if(i.getDeptid()==deptid)
                ans.add(i.getEmp_name());
        }
        return ans;
    }

}
