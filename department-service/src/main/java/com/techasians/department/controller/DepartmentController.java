package com.techasians.department.controller;

import com.techasians.department.entity.Department;
import com.techasians.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.findByDepartmentId(departmentId);
    }
}
