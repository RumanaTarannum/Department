package com.example.test2.pojo;

import jakarta.persistence.*;

@Entity
@Table(name="Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String emp_name;
    private long deptid;
    private long salary;
    public Department(){

    }
    public Department(String emp_name,long deptid,long salary){
        super();
        this.deptid=deptid;
        this.emp_name=emp_name;
        this.salary=salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = this.id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Object getDeptid() {
        return deptid;
    }

    public void setDeptid(long deptid) {
        this.deptid = deptid;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

}
