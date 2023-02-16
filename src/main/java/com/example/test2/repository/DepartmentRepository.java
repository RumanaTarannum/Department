package com.example.test2.repository;

import com.example.test2.pojo.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.*;


public interface DepartmentRepository extends JpaRepository<Department,Long> {
    @Query("Select d from Department d where d.dept_name LIKE %:c% ")
    public List<Department> findByName(@Param("c") String dept_name);
}
